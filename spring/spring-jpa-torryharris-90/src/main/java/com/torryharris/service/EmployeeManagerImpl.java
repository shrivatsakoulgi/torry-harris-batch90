package com.torryharris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.torryharris.dao.EmployeeDAO;
import com.torryharris.model.Employee;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	private EmployeeDAO employeeDAO;
	

	@Transactional
	public void insertEmployee(Employee employee) {
		employeeDAO.insertEmployee(employee);

	}

	public List<Employee> getAllEmployees() {
		
		return employeeDAO.getAllEmployees();
	}

}
