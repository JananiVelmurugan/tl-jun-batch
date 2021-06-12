package com.training.string;

import com.training.oops.Product;

public class StringDemo {
	public static void main(String[] args) {
		String name = "Janani";
		int baseSalary = 10000;
		int bonus = 2000;
		System.out.println(baseSalary + bonus);
		// "Janani"+ 12000
		// "Janani 12000"
		int a = 10;
		int b = 20;
		System.out.println(a + b + ("This is a String"));
		Product product = new Product();
		product.serialNo = 1234;
//		product.description= "oppo mobile";

	}

}
