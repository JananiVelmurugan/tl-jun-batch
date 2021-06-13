package com.training.arrays;

public class Product {
	int id;
	String name;

	Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		Product[] dummy = {new Product(10, "Pen"), new Product(20, "Pencil"),
				new Product(30, "Eraser")};
		
		// Create a products that can store 3 Product Objects
		Product[] products = new Product[3];

		// Creating 3 Product Objects
		Product product1 = new Product(10, "Pen");
		Product product2 = new Product(20, "Pencil");
		Product product3 = new Product(30, "Eraser");

		// Add Product Objects to products
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;

		// Print the products
		for (Product temp : products) {
			System.out.println(temp);
			System.out.println(temp.getId() + "-" + temp.getName());
		}

		System.out.println("Dummy Array");
		for (Product temp : dummy) {
			System.out.println(temp);
			System.out.println(temp.getId() + "-" + temp.getName());
		}
	}

}
