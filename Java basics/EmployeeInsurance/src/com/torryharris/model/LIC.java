package com.torryharris.model;

public class LIC implements Insurance {

	@Override
	public void assignInsurance(Employee employee) {
		
		employee.setInsuranceName("Life Insurance");
		// 2 times the annual salary is the Sum Insured
		employee.setInsuranceSum(employee.getSalary()*12*2);
	}

}
