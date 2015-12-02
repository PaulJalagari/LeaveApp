package com.leave.dao;

import java.util.List;

import com.leave.entity.LeaveEntity;

public interface LeaveDAO {

	public void addLeave(LeaveEntity leave);

	public List<LeaveEntity> getAllLeaves();

	public void approveLeave(Integer leaveId);
}