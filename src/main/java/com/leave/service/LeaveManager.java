package com.leave.service;

import java.util.List;

import com.leave.entity.LeaveEntity;

public interface LeaveManager {
	
	
    public void addLeave(LeaveEntity leave);
    
    public List<LeaveEntity> getAllLeaves();
   
    public void approveLeave(Integer leaveId);
}
