package com.training.arrays;

public class Product {
	int id;
	String name;
	double cost;

	Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Product(int id, String name, double cost) {
		this(id, name);
		this.cost = cost;
	}

	void print() {
		System.out.println(id + "-" + name + "-" + cost);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public static void main(String[] args) {

		Product[] dummy = { new Product(10, "Pen", 100), new Product(20, "Pencil", 200),
				new Product(30, "Eraser", 300) };

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
//			System.out.println(temp.getId() + "-" + temp.getName());
			temp.print();
		}
		products[0].print();
		products[1].getName();

		System.out.println("Dummy Array");
		double sum = 0;
		for (Product temp : dummy) {
			System.out.println(temp);
//			System.out.println(temp.getId() + "-" + temp.getName());
			temp.print();
			sum += temp.getCost();
		}
		System.out.println(sum);
	}

}
