package com.torryharris.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)		// To run the Suite Class

// List the Test classes to be run 
@Suite.SuiteClasses({CalculatorTest.class,
					 UtilityTest.class})

public class TestSuite {

}
