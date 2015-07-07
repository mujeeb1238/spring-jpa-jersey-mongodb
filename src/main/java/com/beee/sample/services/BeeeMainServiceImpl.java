package com.beee.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beee.sample.dao.BeeeDao;
import com.beee.sample.data.MutualContacts;
import com.beee.sample.data.User;
import com.beee.sample.data.UserData;
import com.beee.sample.exception.UserDefinedErrorMessage;
import com.google.gson.Gson;

@Service
public class BeeeMainServiceImpl implements BeeeMainService{

	private static final Gson GSON = new Gson();
	
	
	public final BeeeDao beeeDao;
	
	@Autowired
	public BeeeMainServiceImpl(final BeeeDao beeeDao) {
		this.beeeDao = beeeDao;
	}
	
	@Override
	public String convertAndProcess(String json) {
		UserData user = (UserData)GSON.fromJson(json, UserData.class);	
		User persistUser =  User.fromJson(user.getContactNumber(), user.getTotalExperience(), user.getJobTitle(), user.getName(), user.getProfessionalSummary(),user.getMutualContacts(),user.isDeleted());
		System.out.println("user: "+beeeDao.findOne(persistUser.getContactNumber()));
		if(null == beeeDao.findOne(persistUser.getContactNumber())){
			
			List<MutualContacts> mt = persistUser.getMutualContacts();
			UserData returnData = new UserData();
			for(MutualContacts mct: mt){
				if(null!=beeeDao.findOne(mct.getContactNumber())){
					returnData.getMutualContacts().add(mct);
				}
			}
			User savedUser = beeeDao.saveUser(persistUser);
			returnData.createReturnData(savedUser);
			return GSON.toJson(returnData);
		}
		UserDefinedErrorMessage ud = new UserDefinedErrorMessage("user already exist", "entered contact number already exist", "500", "contactNumber");
		return GSON.toJson(ud);
	}
	
	@Override
	public String sayHello(){
		return "Hello world";
	}
	
	@Override
	public String convertAndGet(String contactNumber) {
		return GSON.toJson(beeeDao.findOne(contactNumber));
	}
}
