package com.mycompany.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.pojo.User;
import com.mycompany.services.IUserService;

@Component
@Path("/users/v1")
public class UserResource {
	
	@Autowired
	private IUserService userService; 
	
	@Path("/getUsers")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers ()
	{
		System.out.println("!!!!!!!!");
		for(final User user : userService.getUsers())
		{
			System.out.println(user.getId());
		}
		System.out.println("!!!!!!!!");		
		
        return  Response.ok().build();
    }
}
