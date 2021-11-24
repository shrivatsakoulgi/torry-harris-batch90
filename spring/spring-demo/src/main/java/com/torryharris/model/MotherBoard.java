package com.torryharris.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MotherBoard {
	
	@Autowired
	CPU cpu;		//Interface
	
	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void display() {
		cpu.display();	
		System.out.println
		("Asus Mother Board.. with CPU, Ethernet, GPU slot..");
	}

}
