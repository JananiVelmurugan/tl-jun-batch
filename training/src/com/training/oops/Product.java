package com.training.oops;

public class Product {

	public int serialNo;
	String description;
	private int id = 10;
	private String name = "Pen";
	double cost;
	private static String ORG = "AMAZON";

	static {
		System.out.println("First Static Block");
	}

	static void init() {
		System.out.println("Static Init Method");
	}

	private void print() {
		int local;
		System.out.println("Product : " + id + " : " + name + " : " + cost);
	}

	public static void main(String[] args) {

//		System.out.println(new Product());
//		System.out.println(new Product());

		init();
		Product product = new Product();
		System.out.println(product);
		System.out.println("Before intialization");
		System.out.println(product.id);
		System.out.println(product.name);
		System.out.println(product.cost);
		// setter
		product.id = 10;
		product.name = "Mobile";
		product.cost = 10000;
		// getter
		System.out.println("After intialization");
		System.out.println(product.id);
		System.out.println(product.name);
		System.out.println(product.cost);
		product.print();
		product = null;
		System.out.println(product);
		Product product1 = new Product();
		System.out.println(product1);

		Product product2 = new Product();
		System.out.println(product2);
		System.out.println(ORG);
//		System.out.println(org);
//		System.out.println(org);

		double randomValue = Math.random();
		System.out.println(randomValue);

		double powResult = Math.pow(3, 2);
		System.out.println(powResult);

		double sqrt = Math.sqrt(4);
		System.out.println(sqrt);
		
		product.description= "oppo mobile";
		
		
	}

	static {
		System.out.println("Second Static Block");
	}
}
