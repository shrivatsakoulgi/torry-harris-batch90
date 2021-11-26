package com.torryharris.spring_jpa_torryharris_90;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.config.EmployeeJPAConfig;
import com.torryharris.dao.EmployeeDAO;
import com.torryharris.dao.EmployeeDAOImpl;
import com.torryharris.dao.EmployeeManager;
import com.torryharris.dao.EmployeeManagerImpl;
import com.torryharris.model.Employee;

public class EmployeeJPADemo {

	public static void main(String[] args) {
		ApplicationContext factory = new
				AnnotationConfigApplicationContext(EmployeeJPAConfig.class);
		
//		System.out.println("Bean names: ");
//		for(String s: factory.getBeanDefinitionNames()){
//			System.out.println(s);
//		}
//		System.out.println();
		
		EmployeeManager employeeManager= factory.getBean(EmployeeManagerImpl.class);
		
		Employee employee = new Employee(1001, "Ram", "Manager", 50000);
		employeeManager.insertEmployee(employee);
		System.out.println("Employee Inserted..");
		System.out.println(employee);

	}

}
