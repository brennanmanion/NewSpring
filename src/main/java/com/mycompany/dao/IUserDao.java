package com.mycompany.dao;

import java.util.List;

import com.mycompany.pojo.User;

public interface IUserDao {
	
	List<User> getUsers();
	
	User getUserByUsername(final String username);
}
