package org.stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stringcalculator.StringCalculator;

public class StringCalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
}
