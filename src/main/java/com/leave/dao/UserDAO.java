package com.leave.dao;

import com.leave.entity.UserEntity;

public interface UserDAO {
	
	public boolean authenticateUser(String userName, String password);
	
	public UserEntity userProfile(String userName);

}
