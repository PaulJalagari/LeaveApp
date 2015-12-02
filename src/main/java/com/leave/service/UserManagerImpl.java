package com.leave.service;

import org.springframework.transaction.annotation.Transactional;

import com.leave.dao.UserDAO;
import com.leave.entity.UserEntity;

public class UserManagerImpl implements UserManager {
	private UserDAO userDAO;

	@Override
	@Transactional
	public boolean findUser(String userName, String password) {

		if (userDAO.findUser(userName, password)) {
			return true;
		} else {
			return false;
		}
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public UserEntity userProfile(String userName, String password) {
		// TODO Auto-generated method stub
		return userDAO.userProfile(userName, password);

	}

}
