package com.torryharris.model;

public class Employee {
	private String name;
	private int empId;
	private String designation;
	private int salary;
	public static int noOfObjects;
	
	static {
		
		System.out.println("Inside Static block 1...");
		System.out.println(noOfObjects);
	}
	static {
		System.out.println("Inside Static block 2...");
	}
	
	public Employee(String name, int empId, String designation, 
			int salary) {
		noOfObjects++;
		this.name = name;
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	public void display() {
		
		System.out.println("----Employee details----");
		System.out.println("Name:"+name);
		System.out.println("Employee ID:"+empId);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
		System.out.println();
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

	public void incrementSalary(int percentage) {
		salary = salary*(100+percentage)/100;
				
	}
	
}
