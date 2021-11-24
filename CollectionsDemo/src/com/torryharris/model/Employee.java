package com.torryharris.model;

public class Employee implements
	Comparable<Employee>{
	
	private String name;
	private int empId;
	private String designation;
	private int salary;
	
	@Override
	public int compareTo(Employee o) {
		
		return (this.empId-o.empId);
	}
	
	
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}

	



}
