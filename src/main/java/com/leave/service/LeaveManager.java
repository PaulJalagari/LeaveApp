package com.leave.service;

import java.util.List;

import com.leave.entity.LeaveEntity;

public interface LeaveManager {
	
	
    public void addLeave(LeaveEntity leave);
    
    public List<LeaveEntity> getAllLeaves();
    
    public void deleteLeave(Integer leaveId);
   
    public void approveLeave(Integer leaveId);
}
