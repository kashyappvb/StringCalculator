package org.stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stringcalculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void testOneAndTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
	@Test
	public void testNewLine(){
	   	assertEquals(6, StringCalculator.add("1\n2,3"));
	}
}
