package com.beee.sample.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beee.sample.services.BeeeMainService;


@Component
@Path("beee")
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
		
		return Response.status(Status.OK).entity(ud).build();
	}
}
