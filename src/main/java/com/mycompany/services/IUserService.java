package com.mycompany.services;

import java.util.List;

import com.mycompany.pojo.User;

public interface IUserService {

	User getUser(final String id);
	
	List<User> getUsers();
}
