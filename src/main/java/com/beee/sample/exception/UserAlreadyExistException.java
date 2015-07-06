package com.beee.sample.exception;


public class UserAlreadyExistException /*extends WebApplicationException */{

	
	public UserDefinedErrorMessage getErrorMessage(final String message) {
		return new UserDefinedErrorMessage(message, "", "500", "given contact number already exist in our database");
	}
}
