package com.torryharris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="empid", nullable=false)
	private int empId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="salary")
	private int salary;

	public Employee() {
	}

	public Employee(int empId, String name, String designation, int salary) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Employee [empId=" + empId + ", name=" 
	+ name + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}
	
	

}
