package com.beee.sample.dao;

import java.util.List;

import com.beee.sample.data.User;

public interface BeeeDao {

	public User saveUser(User user);
	public List<User> finaAllUser();
	public User findOne(String id);
}
