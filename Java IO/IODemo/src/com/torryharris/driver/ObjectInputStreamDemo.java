package com.torryharris.driver;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.torryharris.model.Person;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// De-Serialization Demo
		// Reading Java Objects from a file
		File file = new File("people.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("Person details are:");
		while(true) {
			try {
				Person p1 = (Person) ois.readObject();
				System.out.println(p1);
			}catch(EOFException ex) {
				break;
			}
		}
		ois.close();
		fis.close();
		

	}

}
