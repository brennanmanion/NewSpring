package com.mycompany.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.pojo.User;

@Repository
public class UserDaoImpl implements IUserDao{

	@Autowired
	private SessionFactory sessionFactory;	
	
	@Override
	@Transactional
	public List<User> getUsers() {

		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<User> theQuery = currentSession.createQuery("from User", User.class);
		
		List<User> users = theQuery.getResultList();
		
		return users;		
	}
	
	@Override
	public User getUserByUsername(String userName) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<User> query = currentSession.createQuery("from User where userName = :userName", User.class);
		query.setParameter("userName", userName);
		
		final User user = query.getSingleResult();					
		
		return user;
	}

}
