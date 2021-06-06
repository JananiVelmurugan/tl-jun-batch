package com.training.operators;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		a = a + 20;
		a += 20;// a = a+20
		int b = 30;
//		int c = a + b;
		// a,b are operands
		// + is the operator
		System.out.println(++a);
		System.out.println(a);
		boolean bool = true;
		System.out.println(!bool);
		System.out.println(10 % 5);
		System.out.println(10 / 5);
		System.out.println(2 << 2);
		System.out.println(2 >> 2);

	}

}
