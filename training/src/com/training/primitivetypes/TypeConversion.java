package com.training.primitivetypes;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 10;
		short s = 129;
//		System.out.println(b);
//		System.out.println(s);
//		s = b;
//		System.out.println(s);
//		s = b;// implicit type conversion
		b = (byte) s; // explicit type conversion
		System.out.println(b);
	}

}
