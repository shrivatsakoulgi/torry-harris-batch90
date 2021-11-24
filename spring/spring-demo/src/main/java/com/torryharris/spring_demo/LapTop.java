package com.torryharris.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.model.CPU;
import com.torryharris.model.MotherBoard;
import com.torryharris.model.RAM;

public class LapTop {

	public static void main(String[] args) {
		
		ApplicationContext factory = 
		new AnnotationConfigApplicationContext(LaptopConfig.class);
	
		RAM sanDisk = (RAM) factory.getBean("RAM");
		MotherBoard asus = factory.getBean(MotherBoard.class);
		
		asus.display();
		sanDisk.display();
		
		//CPU intel = (CPU) factory.getBean("CPU");
		//
		//intel.display();
		//
		

	}

}
