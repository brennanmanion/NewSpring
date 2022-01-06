package com.mycompany.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mycompany.pojo.MyUserDetails;
import com.mycompany.pojo.User;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	IUserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		final User user = userService.getUserByUsername(userName);		
		
		return new MyUserDetails(user);
	}
}
