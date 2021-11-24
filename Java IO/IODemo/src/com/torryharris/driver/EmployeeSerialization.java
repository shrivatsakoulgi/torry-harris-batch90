package com.torryharris.driver;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.torryharris.model.Employee;
import com.torryharris.model.Person;

public class EmployeeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Serialization
		Employee amar = new Employee( 1001,"Amar", "Manager", 50000);
		Employee akbar = new Employee(1002,"Akbar",  "Lead", 40000);
		Employee anthony = new Employee(1003,"Anthony",  "Architect", 45000);
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(amar);
		empList.add(akbar);
		empList.add(anthony);
		
		FileOutputStream fos = new FileOutputStream("employees.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
		
		objectOutputStream.writeObject(empList);
		
//		objectOutputStream.writeObject(amar);
//		objectOutputStream.writeObject(akbar);
//		objectOutputStream.writeObject(anthony);
		System.out.println("Serialization done !! \n"
				+ " Employee Objects are stored in File 'employees.txt'");
		objectOutputStream.close();
		fos.close();
		//System.exit(0);
		
		// De-Serialization
		
		FileInputStream fis = new FileInputStream("employees.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fis);
		System.out.println("\nDe-serialization");
		System.out.println("--- Employee Details read from file---\n");
		
		ArrayList<Employee> empList2 = new ArrayList<Employee>();
		empList2 = (ArrayList<Employee>) objectInputStream.readObject();
//		while(true) {
//			try {
//				Employee e = (Employee) objectInputStream.readObject();
//				System.out.println(e);
//			}catch(EOFException ex) {
//				break;
//			}
//		}
		
		for(Employee e:empList2) {
			System.out.println(e.serialVersionUID);
			System.out.println(e);
		}
		objectInputStream.close();
		fis.close();
		
	}

}
