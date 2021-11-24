package com.torryharris.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.torryharris.compartor.EmployeeSortByName;
import com.torryharris.compartor.EmployeeSortBySalary;
import com.torryharris.model.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> iList = new ArrayList<>();
 		
 		iList.add(30);		// add at the end
 		iList.add(10);
 		iList.add(40);
 		iList.add(20);
 		iList.add(40);
 		iList.add(50);
 		iList.add(3,100);		// add at location
 		System.out.println("The collection is:");
 		System.out.println(iList);
 		System.out.println("1st element:"+iList.get(0));
 		
 		Collections.sort(iList);
 		System.out.println();
 		System.out.println("After sorting:");
 		System.out.println(iList);
 		System.out.println("1st element:"+iList.get(0));
 		System.out.println();
 		
 		ArrayList<String> sList = new ArrayList<>();
 		sList.add("abcd");
 		sList.add("xyz");
 		sList.add("aaa");
 		sList.add("defg");
 		
 		System.out.println(sList);
 		//Collections.sort(sList);
 		sList.sort(null);
 		System.out.println("After sorting:");
 		System.out.println(sList);
 		
 		System.out.println();
 		System.out.println();
 		
 		Employee ram = new Employee("Ram",1010,"Manager",50000);
 		Employee shyam = new Employee("Shyam",1002,"Lead",40000);
 		Employee siya = new Employee("Siya",1100,"Architect",55000);
 		Employee radha = new Employee("Radha",1005,"HR",45000);
 		
 		ArrayList<Employee> empList = new ArrayList<>();
 		
 		empList.add(ram);
 		empList.add(shyam);
 		empList.add(siya);
 		empList.add(radha);
 		
 		Iterator<Employee> empItr = empList.iterator();
 		while(empItr.hasNext()) {
 			System.out.println(empItr.next());
 		}
 		
 		empList.sort(null);  // calling sort method
 		
 		System.out.println();
 		System.out.println("--- After Sorting by ID---");
 		Iterator<Employee> empItr2 = empList.iterator();
 		while(empItr2.hasNext()) {
 			System.out.println(empItr2.next());
 		}
 		
 		
 		empList.sort(new EmployeeSortByName()); // Using Comparator Object
 		System.out.println();
 		System.out.println("--- After Sorting by Name---");
 		Iterator<Employee> empItr3 = empList.iterator();
 		while(empItr3.hasNext()) {
 			System.out.println(empItr3.next());
 		}
 		
 		
 		empList.sort(new EmployeeSortBySalary()); // Using Comparator Object
 		System.out.println();
 		System.out.println("--- After Sorting by Salary---");
 		Iterator<Employee> empItr4 = empList.iterator();
 		while(empItr4.hasNext()) {
 			System.out.println(empItr4.next());
 		}
 		
	}

}
