package com.training.constructor;

public class Product {

	private String name;
	private String category;
	private int id;

	public Product() {
	}

	public Product(String name, String category, int id) {
		System.out.println(name + " : " + category + " : " + id);
		this.name = name;
		this.category = category;
		this.id = id;
	}

	public Product(String name, int id, String category) {
		System.out.println(name + " : " + id + " : " + category);
		this.name = name;
		this.category = category;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", id=" + id + "]";
	}

}
