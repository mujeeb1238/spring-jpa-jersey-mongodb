package com.beee.sample.services;


public interface BeeeMainService {

	public String sayHello();

	public String convertAndProcess(String jsonBody);

	public String convertAndGet(String jsonBody);

	public String retrieveAllUsers();

}
