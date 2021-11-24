package com.torryharris.model;

public class HatchBack extends Car{
	
	private String musicSystem;

	public HatchBack() {
		super();
		
	}

	public HatchBack(String name, String fuelType, 
	float engineCapacity, float power, int noOfGears,
	String musicSystem) {
		
		super(name, fuelType, engineCapacity, power, noOfGears);
		this.musicSystem=musicSystem;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	
	public void displayHatchBackFeatures() {
		displayFeatures();
		System.out.println("Music System:"+musicSystem);
		System.out.println();
	}
	
	
	

}
