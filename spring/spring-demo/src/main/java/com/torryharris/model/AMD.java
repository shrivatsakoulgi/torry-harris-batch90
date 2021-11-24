package com.torryharris.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AMD implements CPU{

	public void display() {
		System.out.println
		("AMD Ryzen 7.. Octacore, 4.7GHz.. ");
		
	}

}
