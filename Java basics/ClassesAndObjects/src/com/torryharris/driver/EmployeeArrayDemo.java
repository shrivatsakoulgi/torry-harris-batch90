package com.torryharris.driver;
import com.torryharris.model.Employee;

public class EmployeeArrayDemo {

	public static void main(String[] args) {
		
		Employee []employees = new Employee[3];
		
		employees[0]=new Employee("Ram",100101,"SSE",45000);
		employees[1]=new Employee("Shyam",100201,"SDE",50000);
		employees[2]=new Employee("Siya",100301,"Architect",55000);
		
		for(int i=0;i<employees.length;i++) {
			employees[i].setSalary((int)(employees[i].getSalary()*(1.1)));
		}
		
		for(Employee e:employees) {
			e.display();
		}

	}

}
