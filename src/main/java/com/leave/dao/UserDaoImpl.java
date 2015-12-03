package com.leave.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.leave.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDAO {
	private SessionFactory sessionFactory;
	private UserEntity user;

	public UserEntity currentUser(String userName, String password) {

		Query query = sessionFactory.getCurrentSession()
				.createQuery("from UserEntity where USERNAME=:userName and PASSWORD=:password");
		query.setString("userName", userName);
		query.setString("password", password);
		return (UserEntity) query.uniqueResult();
	}

	@Override
	public boolean authenticateUser(String userName, String password) {
		user = currentUser(userName, password);
		if (user != null)
			return true;
		else
			return false;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public UserEntity userProfile(String userName, String password) {
		// TODO Auto-generated method stub
		return currentUser(userName, password);
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}
