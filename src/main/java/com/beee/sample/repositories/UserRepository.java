package com.beee.sample.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.beee.sample.data.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByContactNumber(String contactNumber);
}
