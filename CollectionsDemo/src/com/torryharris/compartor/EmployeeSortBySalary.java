package com.torryharris.compartor;

import java.util.Comparator;

import com.torryharris.model.Employee;

public class EmployeeSortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (o1.getSalary()-o2.getSalary());
	}

	
}
