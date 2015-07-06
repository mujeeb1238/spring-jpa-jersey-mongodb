package com.beee.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beee.sample.dao.BeeeDao;
import com.beee.sample.data.User;
import com.beee.sample.data.UserData;
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
		if(null != beeeDao.findOne(persistUser.getContactNumber())){
			User savedUser = beeeDao.saveUser(persistUser);
			return GSON.toJson(new UserData(savedUser));
		}
		return "uae";
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
