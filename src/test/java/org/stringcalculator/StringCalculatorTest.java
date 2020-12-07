package org.stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class StringCalculatorTest {
	@Ignore
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	@Ignore
	@Test
	public void testOneAndTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	@Ignore
	@Test
	public void testNewLine(){
	   	assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	
	@Ignore
	@Test
	public void testOtherDelimiter(){
	   	assertEquals(3, StringCalculator.add("//;\n1;2"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumber(){
		StringCalculator.add("-1,2");
		StringCalculator.add("2,-3,4,-5");
	}
}
