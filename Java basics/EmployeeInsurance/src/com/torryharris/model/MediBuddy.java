package com.torryharris.model;

public class MediBuddy implements Insurance {

	@Override
	public void assignInsurance(Employee employee) {
		
		employee.setInsuranceName("Medical Insurance");
		// 10 times the monthly salary is the Sum Insured
		employee.setInsuranceSum(employee.getSalary()*10);

	}

}
