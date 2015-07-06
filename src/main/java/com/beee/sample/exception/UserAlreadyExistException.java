package com.beee.sample.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class UserAlreadyExistException extends WebApplicationException {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7053938067497141319L;

	/**
	 * Create a HTTP 404 (Not Found) exception.
	 */
	public UserAlreadyExistException(final String message) {
		super(Response.status(500).entity(message).type("application/json").build());
	}
}
