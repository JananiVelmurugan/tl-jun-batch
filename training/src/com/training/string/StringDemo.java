package com.training.string;

import com.training.oops.Product;

public class StringDemo {
	public static void main(String[] args) {
		String name = "Janani";
		String name1 = new String("Janani");
		String name2 = new String("Janani");

		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
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

		name = "Test";// scp - "Test"
		System.out.println(name.hashCode());
		name.concat("Leaf"); // scp - "TestLeaf"
		System.out.println(name.hashCode());
		name = name.concat("Leaf");
		System.out.println(name.hashCode());
		name = null;// name is qualified to be garbage collected
		System.gc();
		Runtime.getRuntime().gc();

	}

}
