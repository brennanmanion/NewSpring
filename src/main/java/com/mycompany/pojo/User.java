package com.mycompany.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User extends BaseModel{
	
	public interface Properties extends BaseModel.Properties
	{
		String USER_NAME = "userName";
		String PASSWORD = "password";
		String IS_ACTIVE = "isActive";
	}	
	
    @Setter
    @Getter
    @Column(name = Properties.USER_NAME)
	private String userName;

    @Setter
    @Getter
    @Column(name = Properties.PASSWORD)
	private String password;
    
    @Setter
    @Getter
    @Column(name = Properties.IS_ACTIVE)    
	private Boolean isActive;
    
//    @Setter
//    @Getter
//    @Column(name = Properties.PASSWORD)    
//	private String roles;
	
}
