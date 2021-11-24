package com.torryharris.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.torryharris.model.Calculator;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertEquals(7, calc.add(3, 4));
	}
	@Test
	public void subTest() {
		Calculator calc = new Calculator();
		assertEquals(-1, calc.sub(3, 4));
	}
	@Test
	public void mulTest() {
		Calculator calc = new Calculator();
		assertEquals(12, calc.mul(3, 4));
	}
	@Test
	public void divTest() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.div(17, 4));
	}
	
}
