package com.beee.sample.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class UserAlreadyExistException /*extends WebApplicationException */{

	
	private static final long serialVersionUID = -7053938067497141319L;

	
	public UserDefinedErrorMessage getErrorMessage(final String message) {
		return new UserDefinedErrorMessage(message, "", "500", "given contact number already exist in our database");
	}
}
