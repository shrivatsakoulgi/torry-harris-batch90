package com.torryharris.model;

public class Car {
	private String name;
	private String fuelType;
	private float engineCapacity;
	private float power;
	private int noOfGears;

	public Car() {
		
	}

	public Car(String name, String fuelType, float engineCapacity, 
			float power, int noOfGears) {
		this.name = name;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.power = power;
		this.noOfGears = noOfGears;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public float getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(float engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public void displayFeatures() {
		System.out.println("------------\n");
		System.out.println("Car name:"+name);
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Engine Capacity:"+engineCapacity+" CC");
		System.out.println("Power:"+power+" BHP");
		System.out.println("No of Gears:"+noOfGears);
		
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
	// Method overloading
	public void changeGear(int gearNumber) {
		if(gearNumber<0 || gearNumber>noOfGears) {
		
			System.out.println("Invalid Gear number selected:"+gearNumber);
		}
		else
		System.out.println(name+" Car is changing the Gear to: "
				+gearNumber);
	}
	
	public void changeGear(String gear) {
		
		if(gear.equals("Reverse")) {
			System.out.println(name+" Car is in the Reverse Gear");
		}
		else {
			System.out.println("Invalid Gear selected");
		}
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", fuelType=" + fuelType + ", engineCapacity=" + engineCapacity + ", power="
				+ power + ", noOfGears=" + noOfGears + "]";
	}

	
	
}

