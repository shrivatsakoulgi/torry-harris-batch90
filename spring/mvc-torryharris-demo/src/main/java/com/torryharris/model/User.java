package com.torryharris.model;

public class User {
	private String fName,lName,userName,password;
	private int age;
	
	public User(String fName, String lName, String userName, String password, int age) {
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", userName=" + userName + ", password=" + password
				+ ", age=" + age + "]";
	}
	
	
	
}
