package com.torryharris.driver;

import java.util.TreeMap;

import com.torryharris.model.Student;

public class TreeMapDemo {

	public static void main(String[] args) {
	
		TreeMap<String,String> treeMap = new TreeMap<>();
		
		treeMap.put("a", "Ram");
		treeMap.put("x", "Laxman");
		treeMap.put("s", "Bharath");
		treeMap.put("z", "Shatrughn");
		treeMap.put("m", "Sita");
		
		System.out.println(treeMap);
		
		Student s1 = new Student(110011,"Amar",6,8.76);
		Student s2 = new Student(110007,"Akbar",7,8.99);
		Student s3 = new Student(110021,"Anthony",8,9.34);
		Student s4 = new Student(110011,"Ram",6,9.55);
		
		TreeMap<Student,String> studTreeMap = new TreeMap<Student, String>();
		
		studTreeMap.put(s1, s1.getName());
		studTreeMap.put(s2, s2.getName());
		studTreeMap.put(s3, s3.getName());
		studTreeMap.put(s4, s4.getName());
		
		System.out.println(studTreeMap);
	}

}
