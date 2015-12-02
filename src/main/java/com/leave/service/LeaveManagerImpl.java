package com.leave.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.leave.dao.LeaveDAO;
import com.leave.entity.LeaveEntity;

public class LeaveManagerImpl implements LeaveManager {

	private LeaveDAO leaveDAO;

	@Override
	@Transactional
	public void addLeave(LeaveEntity leave) {
		leaveDAO.addLeave(leave);
	}

	@Override
	@Transactional
	public List<LeaveEntity> getAllLeaves() {
		return leaveDAO.getAllLeaves();
	}

	@Override
	@Transactional
	public void approveLeave(Integer leaveId) {
		leaveDAO.approveLeave(leaveId);

	}

	public LeaveDAO getLeaveDAO() {
		return leaveDAO;
	}

	public void setLeaveDAO(LeaveDAO leaveDAO) {
		this.leaveDAO = leaveDAO;
	}
}
