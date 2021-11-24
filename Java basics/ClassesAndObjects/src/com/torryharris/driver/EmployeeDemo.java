package com.torryharris.driver;
import com.torryharris.model.Employee;

public class EmployeeDemo {
	
		

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Amar", 1001, "Manager", 50000);
		System.out.println("No. of objects created:"+Employee.noOfObjects);
		
		Employee e2 = new Employee("Akbar", 1002, "Tech Lead", 45000);
		System.out.println("No. of objects created:"+Employee.noOfObjects);
		
		Employee e3 = new Employee("Anthony", 1003, "HR", 40000);
		System.out.println("No. of objects created:"+Employee.noOfObjects);
		
		
		e1.display();
		e2.display();
		e3.display();
	
		e1.incrementSalary(10);
		e2.incrementSalary(8);
		e3.incrementSalary(13);
		
		System.out.println(e1.getSalary());
		System.out.println(e2.getSalary());
		System.out.println(e3.getSalary());
		
	
	}

}
