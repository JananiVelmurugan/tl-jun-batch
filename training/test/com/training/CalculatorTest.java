package com.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c = new Calculator();
		int result = c.add(100, 200);
		assertEquals("Matches", 300, result, 0);

	}

}
