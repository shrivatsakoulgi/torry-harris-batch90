package com.torryharris.driver;
import com.torryharris.model.Car;

public class CarDemo {

	public static void main(String[] args) {
	
		Car brezza = new Car("Brezza","Petrol",1498.5f,96.5f,6);
		
		brezza.displayFeatures();

		brezza.accelerate();
		brezza.changeGear();
		brezza.steer();
		brezza.applyBrake();

	}

}
