 package com.torryharris.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Intel implements CPU{

	public void display() {
		System.out.println
		("Intel Processor, i7, Octa core, 3GHz..");
		
	}

}
