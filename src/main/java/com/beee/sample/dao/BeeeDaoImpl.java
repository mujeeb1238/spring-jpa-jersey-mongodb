package com.beee.sample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.beee.sample.data.User;
import com.beee.sample.repositories.UserRepository;

@Service
public class BeeeDaoImpl implements BeeeDao{

	@Autowired
	private MongoTemplate template;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		template.save(user);
		return user;
	}

	@Override
	public List<User> finaAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(String contactNumber) {
		return userRepository.findByContactNumber(contactNumber);
	}

}
