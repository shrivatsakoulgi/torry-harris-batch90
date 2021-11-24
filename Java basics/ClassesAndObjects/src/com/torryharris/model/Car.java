package com.torryharris.model;

public class Car {
	private String name;
	private String fuelType;
	private float engineCapacity;
	private float power;
	private int noOfGears;
	
	public Car(String name, String fuelType, float engineCapacity, 
			float power, int noOfGears) {
		this.name = name;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.power = power;
		this.noOfGears = noOfGears;
	}
	
	public void displayFeatures() {
		System.out.println("------------\n");
		System.out.println("Car name:"+name);
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Engine Capacity:"+engineCapacity+" CC");
		System.out.println("Power:"+power+" BHP");
		System.out.println("No of Gears:"+noOfGears);
		System.out.println();
	}

	public void accelerate() {
		System.out.println(name+" Car is accelerating...");
	}
	
	public void applyBrake() {
		System.out.println(name+" Car is slowing down/stopping");
	}
	
	public void steer() {
		System.out.println(name+" Car is changing the directions");
	}
	
	public void changeGear() {
		System.out.println(name+" Car is changing the Gears");
	}
}

