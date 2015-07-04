package com.beee.sample.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.beee.sample.services.BeeeMainService;


@Component
@Path("home")
public class BeeeResourceApi {

	
	private final BeeeMainService service;
	private final RedisTemplate<String, String> template;
	
	/*@Resource(name="template")
    private ListOperations<String, String> listOps;
	
	@Resource(name="template")
	private ValueOperations<String, Integer> intOp;*/
	
	@Autowired
	public BeeeResourceApi(final BeeeMainService service, RedisTemplate<String, String> template) {
		this.service = service;
		this.template = template;
	}
	
	@GET
	@Path("/sayhello")
	public Response sayHello(){
		//listOps.leftPush("1238", "Syed Mujeeb ur Rahman");
		 template.opsForValue().set("1238", "Syed Mujeeb ur Rahman opts for value11");
        
        // or use template directly
        //redisTemplate.boundListOps("1238").leftPush("Hellow world");
        //System.out.println(template.opsForValue().get("1238"));
		return Response.status(Status.OK).entity(service.sayHello()).build();
	}
}
