package com.leave.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.leave.entity.LeaveEntity;
import com.leave.service.LeaveManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LeaveAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(LeaveAction.class);
	private List<LeaveEntity> leaves;
	private LeaveEntity leave;
	private LeaveManager leaveManager;

	public String listLeaves() {
		logger.info("listleaves method called");
		leaves = leaveManager.getAllLeaves();
		return SUCCESS;
	}

	public String addLeave() {
		logger.info("addLeave method called");
		leaveManager.addLeave(leave);
		return SUCCESS;
	}


	public String approveLeave() {
		logger.info("approveLeave method called");
		leaveManager.approveLeave(leave.getId());
		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		leave = null;
	}

	public void setLeaveManager(LeaveManager leaveManager) {
		this.leaveManager = leaveManager;
	}

	public List<LeaveEntity> getLeaves() {
		return leaves;
	}

	public void setLeaves(List<LeaveEntity> leaves) {
		this.leaves = leaves;
	}

	public LeaveEntity getLeave() {
		return leave;
	}

	public void setLeave(LeaveEntity leave) {
		this.leave = leave;
	}
}
