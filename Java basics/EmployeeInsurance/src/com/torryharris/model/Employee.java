package com.torryharris.model;

public class Employee {
	
	private String name;
	private int empId;
	private String designation;
	private int salary;
	private int insuranceSum;
	private String insuranceName;
	
	public Employee(String name, int empId, String designation, int salary) {
	
		this.name = name;
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getInsuranceSum() {
		return insuranceSum;
	}

	public void setInsuranceSum(int insuranceSum) {
		this.insuranceSum = insuranceSum;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", designation=" + designation + ", salary=" + salary
				+ ", insuranceSum=" + insuranceSum + ", insuranceName=" + insuranceName + "]";
	}
	
	

}
