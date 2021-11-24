package com.torryharris.model;

import java.io.Serializable;

public class Person implements Serializable {
	
	private int personId;
	private String name;
	private String address;
	private long phoneNumber;
	
	public Person(int personId, String name, String address, long phoneNumber) {
		this.personId = personId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}

	
	
	

}
