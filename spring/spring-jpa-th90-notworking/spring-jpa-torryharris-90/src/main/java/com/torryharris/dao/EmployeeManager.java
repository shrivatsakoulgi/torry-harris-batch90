package com.torryharris.dao;

import java.util.List;

import com.torryharris.model.Employee;

public interface EmployeeManager {
	
	void insertEmployee(Employee employee);
	List<Employee> getAllEmployees();

}
