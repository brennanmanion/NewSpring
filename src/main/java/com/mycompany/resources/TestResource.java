package com.mycompany.resources;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import com.mycompany.api.data.v1.TestRequest;

@Validated
@Component
@Path("/test")
public class TestResource {
	
	@Path("/test")
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response testWS (String message)
	{
		System.out.println("!!!!!!!!");
		System.out.println(message);
		System.out.println("!!!!!!!!");		
		
        return  Response.ok().build();
    }
	
	@Path("/testrequest")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response testWS (@Valid final TestRequest testRequest, BindingResult result)
	{
		try
		{
			
		}
		catch (final Exception e)
		{
			
		}
        return  Response.ok().build();
    }	
}
