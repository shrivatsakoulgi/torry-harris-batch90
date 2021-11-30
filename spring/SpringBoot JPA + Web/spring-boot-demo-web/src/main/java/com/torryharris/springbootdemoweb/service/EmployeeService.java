package com.torryharris.springbootdemoweb.service;

import java.util.List;

import com.torryharris.springbootdemoweb.model.Employee;

public interface EmployeeService {

	 void save(Employee employee);
	 List<Employee> getAllEmployees();
	 Employee getEmployeeById(int empId);
	 void deleteEmployee(int empId);
	 void updateEmployee(Employee employee);
}
