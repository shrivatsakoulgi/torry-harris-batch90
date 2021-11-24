package com.torryharris.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.torryharris.model.Utility;

public class UtilityTest {
	public Utility util;
	@Before
	public void before() {
		//System.out.println("Before Test Case");
		 util = new Utility();
	}
	
	@After
	public void after() {
		//System.out.println("After the test case");
	}
	@Test
	public void concatStringTest() {	
		assertEquals("torryharris", util.concatString("torry", "harris"));
	}

	@Test
	public void primeOrNotTest() {
	
		assertTrue(util.primeOrNot(7));
		assertTrue(!util.primeOrNot(10));	
		
	}
	
	@Test
	public void squareTest() {
		assertEquals(16,util.square(4));
	}
	
	@Test
	public void largestTest() {
		
		assertEquals(10, util.largest(getArray()));
	}
	
	public int [] getArray() {
		int []array= {5,7,1,8,10,6};
		return array;
	}
	
	
}
