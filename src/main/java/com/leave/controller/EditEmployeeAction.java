package com.leave.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.leave.entity.EmployeeEntity;
import com.leave.service.EmployeeManager;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EditEmployeeAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(EditEmployeeAction.class);
	private List<EmployeeEntity> employees;
	private EmployeeEntity employee;
	private EmployeeManager employeeManager;

	public String listEmployees() {
		logger.info("listEmployees method called");
		employees = employeeManager.getAllEmployees();
		return SUCCESS;
	}

	public String addEmployee() {
		logger.info("addEmployee method called");
		employeeManager.addEmployee(employee);
		return SUCCESS;
	}

	public String deleteEmployee() {
		logger.info("deleteEmployee method called");
		employeeManager.deleteEmployee(employee.getId());
		return SUCCESS;
	}

	public String approveLeave() {
		logger.info("approveLeave method called");
		employeeManager.approveLeave(employee.getId());
		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		employee = null;
	}

	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	public List<EmployeeEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeEntity> employees) {
		this.employees = employees;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
}
