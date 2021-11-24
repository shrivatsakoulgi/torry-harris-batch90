package com.torryharris.dao;

import java.util.List;

import com.torryharris.model.Employee;

public interface EmployeeDAO {

	void save(Employee employee);
	
	Employee getById(int empId);
	
	void update(Employee employee);
	
	void deleteById(int empId);
	
	List<Employee> getAllEmployees();
}
