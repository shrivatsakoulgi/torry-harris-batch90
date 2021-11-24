package com.torryharris.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.torryharris.model.Person;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException {
		// Serialization Demo
		// Storing Java objects in to a file
		Person jon = new Person(11007, "Jon Snow", "Bengaluru", 12345678L);
		Person danerys = new Person(11002, "Danerys", "Cochin", 2233445566L);
		Person arya = new Person(11010, "Arya Stark", "Delhi", 773399477L);
		Person tyrion = new Person(11001, "Tyrion", "West Bengal", 723682192L);
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(jon);
		people.add(danerys);
		people.add(arya);
		people.add(tyrion);
		
		FileOutputStream fos = new FileOutputStream("people.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		for(Person p:people) {
			os.writeObject(p);
		}
		System.out.println("Person data has been inserted in the file ");
		os.close();
		fos.close();
	}

}
