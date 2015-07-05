package com.beee.sample.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beee.sample.data.User;

public interface UserRepository extends MongoRepository<User, String> {

	List<User> findByContactNumber(String contactNumber);
}
