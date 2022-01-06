package com.mycompany.pojo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails{

	private String userName;
	private String password;
	private Boolean active;
	private List<GrantedAuthority> authorities;
	
	public MyUserDetails(final User user) {
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.active = user.getIsActive() != null ? user.getIsActive().booleanValue() : null;
		this.authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}
	
	public MyUserDetails(final String userName) {
		this.userName = userName;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {
		return "pass";
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
