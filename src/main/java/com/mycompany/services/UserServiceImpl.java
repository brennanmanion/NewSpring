package com.mycompany.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.dao.IUserDao;
import com.mycompany.pojo.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getUser(String id) {
		return null;
	}

	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}
}
