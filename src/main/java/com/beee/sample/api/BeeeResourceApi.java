package com.beee.sample.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import jersey.repackaged.com.google.common.util.concurrent.ThreadFactoryBuilder;

import org.glassfish.jersey.process.JerseyProcessingUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.beee.sample.services.BeeeMainService;

@Component
@Path("beee")
public class BeeeResourceApi {

	private static final ExecutorService TASK_EXECUTOR = Executors
			.newCachedThreadPool(new ThreadFactoryBuilder()
					.setNameFormat("long-running-resource-executor-%d")
					.setUncaughtExceptionHandler(
							new JerseyProcessingUncaughtExceptionHandler())
					.build());

	private final BeeeMainService service;

	@Autowired
	public BeeeResourceApi(final BeeeMainService service) {
		this.service = service;
	}

	@POST
	@Path("/registerUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHello(final String jsonBody) {

		String ud = service.convertAndProcess(jsonBody);
		return Response.status(Status.OK).entity(ud).build();
	}

	@GET
	@Path("/retrieveUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void retrieveUser(
			@QueryParam("contactNumber") final String contactNumbere,
			@Suspended final AsyncResponse ar) {

		TASK_EXECUTOR.submit(new Runnable() {

			public void run() {
				String ud = service.convertAndGet(contactNumbere);
				ar.resume(Response.status(Status.OK).entity(ud).build());
			}
		});
	}

}
