package com.torryharris.spring_jpa_torryharris_90;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.config.EmployeeJPAConfig;
import com.torryharris.dao.EmployeeDAO;
import com.torryharris.dao.EmployeeDAOImpl;
import com.torryharris.model.Employee;
import com.torryharris.service.EmployeeManager;
import com.torryharris.service.EmployeeManagerImpl;

public class EmployeeJPADemo {

	public static void main(String[] args) {
		ApplicationContext factory = new
				AnnotationConfigApplicationContext(EmployeeJPAConfig.class);
		

		
		EmployeeManager employeeManager= factory.getBean(EmployeeManager.class);
		
		Employee shyam = new Employee(1002, "Shyam", "Lead", 45000);
		Employee siya = new Employee(1003, "Siya", "Architect", 48000);
		Employee radha = new Employee(1004, "Radha", "CEO", 70000);
		employeeManager.insertEmployee(shyam);
		employeeManager.insertEmployee(siya);
		employeeManager.insertEmployee(radha);
		System.out.println("Employees Inserted..");
	
		List<Employee> empList = employeeManager.getAllEmployees();
		
		System.out.println();
		System.out.println("---Employee List---");
		for(Employee e:empList){
			System.out.println(e);
		}

	}

}
