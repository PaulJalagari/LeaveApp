package com.leave.service;

import com.leave.entity.UserEntity;

public interface UserManager {

	public boolean authenticateUser(String userName, String password);

	public UserEntity userProfile(String userName);

}
