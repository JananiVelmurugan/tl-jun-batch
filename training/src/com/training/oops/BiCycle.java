package com.training.oops;

public class BiCycle {

	public static void main(String[] args) {

		BiCycle biCycle = new BiCycle();
		System.out.println(biCycle);

		Product product = new Product();
		product.serialNo= 1234;
		
		product.description= "oppo mobile";
		System.out.println(VariableDemo.staticVar);

	}
	void print() {
		System.out.println(VariableDemo.staticVar);
	}

}
