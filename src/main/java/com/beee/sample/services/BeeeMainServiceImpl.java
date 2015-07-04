package com.beee.sample.services;

import org.springframework.stereotype.Service;

@Service
public class BeeeMainServiceImpl implements BeeeMainService{

	public BeeeMainServiceImpl() {
		
	}
	
	@Override
	public String sayHello(){
		return "Hello world";
	}
}
