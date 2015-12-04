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

	private UserManager userManager;
	
	private UserEntity user;

	public String userProfile() {
		logger.info("userProfile method called");
		user = userManager.userProfile(user.getUserName());
		if (user != null)
			return SUCCESS;
		else
			return ERROR;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
}
