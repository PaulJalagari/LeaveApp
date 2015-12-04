package com.leave.controller;

import org.apache.log4j.Logger;

import com.leave.entity.UserEntity;
import com.leave.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(LoginAction.class);

	private UserEntity user;

	private UserManager userManager;

	public String authenticateUser() {
		logger.info("authenticateUser method called");
		if (userManager.authenticateUser(user.getUserName(), user.getPassword()))
			return SUCCESS;
		else
			return ERROR;

	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		user = null;

	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
}
