package com.torryharris.model;

public class Student implements Comparable<Student>{

	private int USN;
	private String name;
	private int sem;
	private double cgpa;
	
	public Student(int uSN, String name, int sem, double cgpa) {
		USN = uSN;
		this.name = name;
		this.sem = sem;
		this.cgpa = cgpa;
	}
	@Override
	public int compareTo(Student o) {
		
		return (this.USN-o.USN);
	}
	public int getUSN() {
		return USN;
	}

	public void setUSN(int uSN) {
		USN = uSN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [USN=" + USN + ", name=" + name + ", sem=" + sem + ", cgpa=" + cgpa + "]";
	}

	
	
	
}
