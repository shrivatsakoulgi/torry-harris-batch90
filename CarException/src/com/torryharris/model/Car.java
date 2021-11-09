package com.torryharris.model;

import com.torryharris.exception.IndicatorOperationException;
import com.torryharris.exception.SafetyHazardException;
import com.torryharris.exception.SpeedLimitExceededException;

public class Car {
	private String name;
	private String fuelType;
	private int noOfGears;
	private int speed;
	private int speedLimit;
	private boolean seatBelt;
	private boolean indicator;
	
	public Car() {
		
	}


	public Car(String name, String fuelType, int noOfGears, int speedLimit) {
		super();
		this.name = name;
		this.fuelType = fuelType;
		this.noOfGears = noOfGears;
		this.speedLimit = speedLimit;
		this.speed=0;
		seatBelt = false;
		indicator=false;
	}


	public boolean isSeatBelt() {
		return seatBelt;
	}


	public void setSeatBelt(boolean seatBelt) {
		this.seatBelt = seatBelt;
	}


	public boolean isIndicator() {
		return indicator;
	}


	public void setIndicator(boolean indicator) {
		this.indicator = indicator;
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


	public int getNoOfGears() {
		return noOfGears;
	}


	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getSpeedLimit() {
		return speedLimit;
	}


	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", fuelType=" + fuelType + ", noOfGears=" + noOfGears + ", speed=" + speed
				+ ", speedLimit=" + speedLimit + "]";
	}


	public void accelerate() throws SpeedLimitExceededException, SafetyHazardException {
		
		System.out.println(name+" Car is accelerating...");
		speed=speed+20;
		
		if(speed>0 && !seatBelt) {
			speed-=20;
			throw new SafetyHazardException("Seat Belt not ON ");
		}	
		if(speed>speedLimit) {
			speed-=20;
			throw new SpeedLimitExceededException("Speed limit crossed..!!");
		}
		System.out.println("Car is moving at "+speed+" kmph");
		System.out.println();
	}
	public void steer() throws IndicatorOperationException {
		if(!indicator)
		{
			throw new IndicatorOperationException("Indicator not Turned on");
		}
		System.out.println(name+" Car is changing the directions");
	}
	
	public void applyBrake() {
		System.out.println(name+" Car is slowing down/stopping");
		speed=speed-10;
		System.out.println("Car is moving at "+speed+" kmph");
		System.out.println();
	}
	
	
	
	public void changeGear() {
		System.out.println(name+" Car is changing the Gears");
	}
	
	
	
}

