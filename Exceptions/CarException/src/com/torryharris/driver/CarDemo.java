package com.torryharris.driver;

import com.torryharris.exception.IndicatorOperationException;
import com.torryharris.exception.SafetyHazardException;
import com.torryharris.exception.SpeedLimitExceededException;
import com.torryharris.model.Car;

public class CarDemo {

	public static void main(String[] args) {
		
		Car swift = new Car("Swift", "Petrol", 5, 60);
		
		try {
			swift.setSeatBelt(true);
			swift.accelerate();
			
			swift.accelerate();
			swift.applyBrake();
			swift.setIndicator(true);
			swift.steer();
			swift.setIndicator(false);
			swift.applyBrake();
			swift.applyBrake();
			swift.applyBrake();
			
			swift.setSeatBelt(false);
		} catch (SpeedLimitExceededException e) {
			System.out.println(e);
		} catch (SafetyHazardException e) {
			
			e.printStackTrace();
		} catch (IndicatorOperationException e) {
			
			e.printStackTrace();
		}

	}

}
