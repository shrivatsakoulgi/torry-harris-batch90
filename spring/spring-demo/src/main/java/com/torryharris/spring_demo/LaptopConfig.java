package com.torryharris.spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.torryharris.model.CPU;
import com.torryharris.model.Intel;
import com.torryharris.model.MotherBoard;
import com.torryharris.model.RAM;

@Configuration
@ComponentScan (basePackages = { "com.torryharris.model"})
public class LaptopConfig {
	
/*	@Bean("CPU")
	public CPU getCPU() {
		return new AMD();
	}
	
	@Bean("RAM")
	public RAM getRAM() {
		return new RAM();
	}

	@Bean("MotherBoard")
	public MotherBoard getMotherBoard() {
		return new MotherBoard();
	} */
}
