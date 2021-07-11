package com.training;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest2 {
	static Calculator c = null;

	@BeforeClass
	public static void beforeClass() {
		c = new Calculator();
		System.out.println("before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");

	}

	@Before
	public void before() {
		System.out.println("before");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@Test
	public void testAdd() {
		System.out.println("add");
//		Calculator c = new Calculator();
		int actual = c.add(100, 200);
		assertEquals(300, actual);

		int actual1 = c.add(0, 200);
		assertEquals(210, actual1);

		int actual2 = c.add(100, 0);
		assertEquals(110, actual2);
	}

	@Test
//	@Ignore
	public void testSub() {
		System.out.println("sub");
//		Calculator c = new Calculator();
		int actual = c.sub(1000, 200);
		assertEquals(800, actual);
	}

}
