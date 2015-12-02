package com.leave.service;

import com.leave.entity.UserEntity;

public interface UserManager {

	public boolean findUser(String userName, String password);

	public UserEntity userProfile(String userName,String password);

}
