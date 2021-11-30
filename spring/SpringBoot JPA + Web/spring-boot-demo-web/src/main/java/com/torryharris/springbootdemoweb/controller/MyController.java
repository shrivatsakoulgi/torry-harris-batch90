package com.torryharris.springbootdemoweb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torryharris.springbootdemoweb.model.Employee;
import com.torryharris.springbootdemoweb.service.EmployeeService;

@RestController
public class MyController {
	@Autowired
	private EmployeeService employeeService;
	// All employees
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees(){
		return (ArrayList<Employee>) employeeService.getAllEmployees();
	}	
	// Employee by ID	
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeByID(@PathVariable("empId") int empId) {	
		return employeeService.getEmployeeById(empId);
	}
	// to Create an Employee object
	@PostMapping("/employee/add")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
	}	
	// to Delete an Employee	
	@DeleteMapping("/employee/delete/{empId}")
	public void deleteEmployeeById(@PathVariable int empId) {
		employeeService.deleteEmployee(empId);
	}
	// Update Employee
	@PutMapping("/employee/update/{empId}")
	public void updateEmployee(@PathVariable int empId, @RequestBody Employee newEmp) {
		employeeService.updateEmployee(newEmp);
	}
}
