package com.torryharris.driver;

import com.torryharris.model.HatchBack;
import com.torryharris.model.SUV;

public class CarDemonstration {

	public static void main(String[] args) {
		
		HatchBack swift = new HatchBack("Swift","Petrol",
						  1196.4f,90.2f,5,"Sony");
		System.out.println(swift.toString());
		
		/*
		swift.displayHatchBackFeatures();
		swift.accelerate();
		
		swift.changeGear();
		swift.changeGear(10);
		swift.changeGear(2);
		swift.changeGear("Reverse");
		
		swift.steer();
		swift.applyBrake(); */
		
		
		SUV rangeRover = new SUV("Range Rover","Diesel",2400f,
				150.5f,7,"City");
		
		System.out.println(rangeRover);
		
		rangeRover.accelerate();
		rangeRover.setDriveMode("Sports");
		rangeRover.accelerate();
		rangeRover.setDriveMode("ECO");
		rangeRover.accelerate();
		
		
	
	}

}
