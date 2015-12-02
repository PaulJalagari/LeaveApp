package com.leave.controller;

import org.apache.log4j.Logger;

import com.leave.entity.UserEntity;
import com.leave.service.UserManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ProfileAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ProfileAction.class);

	private UserEntity user;

	private UserManager userManager;

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		user = null;
	}

	public String userProfile() {
		logger.info("userProfile method called");
		user = userManager.userProfile(user.getUserName(), user.getPassword());
		if (user != null)
			return SUCCESS;
		else
			return ERROR;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
}
