package com.torryharris.springbootdemoweb.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torryharris.springbootdemoweb.model.Employee;
import com.torryharris.springbootdemoweb.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void save(Employee employee) {		
		employeeRepository.save(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();	
	}
	@Override
	public Employee getEmployeeById(int empId) {	
		return employeeRepository.findById(empId).get();
	}
	@Override
	public void deleteEmployee(int empId) {
		employeeRepository.deleteById(empId);
	}
	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.deleteById(employee.getEmpId());
		employeeRepository.save(employee);
	}

}
