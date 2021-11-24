package com.torryharris.model;

public class HDFC implements Insurance{

	@Override
	public void assignInsurance(Employee employee) {
		
		employee.setInsuranceName("Term Insurance");
		// 5 times the annual salary is the Sum Insured
		employee.setInsuranceSum(employee.getSalary()*12*5);
	}

}
