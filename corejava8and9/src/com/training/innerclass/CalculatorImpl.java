package com.training.innerclass;

public class CalculatorImpl implements Calculator {

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	public void sub(int c, int d) {
		System.out.println(c - d);
	}

	public static void main(String[] args) {
		CalculatorImpl impl = new CalculatorImpl();
		impl.add(5, 5);
	}

}
