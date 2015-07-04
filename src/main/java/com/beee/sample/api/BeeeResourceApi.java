package com.beee.sample.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beee.sample.services.BeeeMainService;


@Component
@Path("home")
public class BeeeResourceApi {

	
	private final BeeeMainService service;
	
	@Autowired
	public BeeeResourceApi(final BeeeMainService service) {
		this.service = service;
	}
	
	@GET
	@Path("/sayhello")
	public Response sayHello(){
		
		return Response.status(Status.OK).entity(service.sayHello()).build();
	}
}
