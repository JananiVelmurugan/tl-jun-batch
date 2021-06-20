package com.training.java5;

public class Autoboxing {

	public static void main(String[] args) {
		
		int i = 10;
		// Integer j = new Integer(20)
		Integer j = 20;// autoboxing - primitive to object 
		Integer k = new Integer(20);// object
		System.out.println(i);
		System.out.println(j);
		// int k = 20
		System.out.println(++k);// unboxing - object to primitive & it will pre increment
	}
	
}
