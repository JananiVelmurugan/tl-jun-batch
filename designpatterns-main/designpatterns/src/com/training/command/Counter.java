package com.training.command;

public class Counter {
	private static int number = 0;
	
	private Counter() {}
	
	public static int add( int i) {
		number += i;
		return number;
	}
	
	public static int subtract( int i) {
		number -= i;
		return number;
	}
	
	public static int multiply( int i ) {
		number *= i;
		return number;
	}
	
	public static int divide (int i ) {
		number /= i;
		return number;
	}

	public static int getValue() {
		return number;
	}
	
}
