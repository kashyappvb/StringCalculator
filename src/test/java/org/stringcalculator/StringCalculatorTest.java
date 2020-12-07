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
	
	@Test
    public void testNegativeNumber(){
    	try {
    		StringCalculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			StringCalculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }
}
