package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.HDFC;
import com.torryharris.model.Insurance;
import com.torryharris.model.LIC;
import com.torryharris.model.MediBuddy;

public class EmployeeInsuranceDemo {

	public static void main(String[] args) {
		Employee amar = new Employee("Amar", 1001, "Manager", 50000);
		Employee akbar = new Employee("Akbar", 1002, "Lead", 40000);
		Employee anthony = new Employee("Anthony", 1003, "Architect", 45000);
		 
		Insurance insurance = new HDFC();
		insurance.assignInsurance(amar);
		
		insurance = new LIC();
		insurance.assignInsurance(akbar);
		
		insurance = new MediBuddy();
		insurance.assignInsurance(anthony);
		
		System.out.println(amar);
		System.out.println();
		
		System.out.println(akbar);
		System.out.println();
		
		System.out.println(anthony);
		System.out.println();
	}

}
