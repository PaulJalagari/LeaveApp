package com.leave.dao;

import com.leave.entity.UserEntity;

public interface UserDAO {
	
	public boolean findUser(String userName, String password);
	
	public UserEntity userProfile(String userName,String password);

}
