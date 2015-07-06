package com.beee.sample.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.beee.sample.exception.UserAlreadyExistException;
import com.beee.sample.services.BeeeMainService;


@Component
@Path("beee")
@Scope("singleton")
public class BeeeResourceApi {

	
	private final BeeeMainService service;
	
	@Autowired
	public BeeeResourceApi(final BeeeMainService service) {
		this.service = service;
	}
	
	@POST
	@Path("/registerUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello(final String jsonBody){
		
		String ud = service.convertAndProcess(jsonBody);
		if(ud != null && ud.equalsIgnoreCase("uae")){
			throw new UserAlreadyExistException("{'message':'user already exist','errorCode':'uaeE'}");
		}
		return Response.status(Status.OK).entity(ud).build();
	}
	
	@GET
	@Path("/retrieveUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response retrieveUser(@QueryParam("contactNumber") String contactNumber){
		
		String ud = service.convertAndGet(contactNumber);
		
		return Response.status(Status.OK).entity(ud).build();
	}
	
	
}
