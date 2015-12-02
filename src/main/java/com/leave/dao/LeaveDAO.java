package com.leave.dao;

import java.util.List;

import com.leave.entity.LeaveEntity;

public interface LeaveDAO 
{
	//This method will be called when a employee object is added
    public void addLeave(LeaveEntity leave);
    //This method return list of employees in database
    public List<LeaveEntity> getAllLeaves();
    //Deletes a employee by it's id
    public void deleteLeave(Integer leaveId);
    //approves leave request
    public void approveLeave(Integer leaveId);
}