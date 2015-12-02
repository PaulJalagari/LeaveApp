package com.leave.service;

import java.util.List;

import com.leave.entity.EmployeeEntity;

public interface EmployeeManager {
	
	//This method will be called when a employee object is added
    public void addEmployee(EmployeeEntity employee);
    //This method return list of employees in database
    public List<EmployeeEntity> getAllEmployees();
    //Deletes a employee by it's id
    public void deleteEmployee(Integer employeeId);
    //approves leave request
    public void approveLeave(Integer employeeId);
}
