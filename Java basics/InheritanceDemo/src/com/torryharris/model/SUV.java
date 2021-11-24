package com.torryharris.model;

public class SUV extends Car {
	private String driveMode;

	public SUV() {
		super();
		
	}

	public SUV(String name, String fuelType, float engineCapacity, 
			float power, int noOfGears, String driveMode) {
		super(name, fuelType, engineCapacity, power, noOfGears);
		this.driveMode=driveMode;
	}
	
	
	
	public String getDriveMode() {
		return driveMode;
	}

	public void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}
			// Method Overriding
	public void accelerate() {
		if(driveMode.equals("ECO")) {
			System.out.println(getName()+" car is accelerating "
					+ "slowly in "+driveMode+" Mode");
		}
		else if(driveMode.equals("City")) {
			System.out.println(getName()+" car is accelerating "
					+ "moderately in "+driveMode+" Mode");
		}
		else if(driveMode.equals("Sports")){
			System.out.println(getName()+" car is accelerating "
					+ "rapidly in "+driveMode+" Mode");
		}
		else {
			System.out.println("Invalid Drive Mode");
		}
	}

	@Override
	public String toString() {
		
		return "SUV ["+ super.toString()+" driveMode=" + 
		driveMode + "]";
	}
	

	
	
}
