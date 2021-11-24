package com.torryharris.SpringJdbcDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.torryharris.dao.EmployeeDAO;
import com.torryharris.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeDAO employeeDAO = factory.getBean("employeeDAO", EmployeeDAO.class);
		
		Employee ram = new Employee(1001, "Ram", "Manager", 50000);
		Employee shyam = new Employee(1005, "Shyam", "Lead", 40000);
		Employee sita = new Employee(1008, "Sita", "Architect", 45000);
		Employee radha = new Employee(1011, "Radha", "HR", 40000);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(ram);
		empList.add(shyam);
		empList.add(sita);
		empList.add(radha);
		// Saving into DB
		
//		for(Employee e: empList) {
//		employeeDAO.save(e);
//		}
		
		// Reading employee by ID
		int empId=1011;
		Employee e = employeeDAO.getById(empId);
		if(e!=null) {
			System.out.println(e);
		}else {
			System.out.println("Employee not found with id:"+empId);
		}
		
		// Reading all Employees
		
		System.out.println("\n--- Employee Details --- \n");
		List<Employee> empList2 = employeeDAO.getAllEmployees();
		
		for(Employee emp: empList2) {
			System.out.println(emp);
			}
		
		// Employee Delete
		
		empId=1008;
		employeeDAO.deleteById(empId);
		
		// update employee
		ram.setDesignation("Senior Manager");
		ram.setSalary(60000);
		
		employeeDAO.update(ram);
	}

}
