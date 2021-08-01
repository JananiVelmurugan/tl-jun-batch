package com.training.constructor;

public class ProductFactory {
	private String name;
	private String category;
	private int id;

	public ProductFactory() {
	}

	public ProductFactory(String name, int id, String category) {
		System.out.println(name + " : " + id + " : " + category);
		this.name = name;
		this.category = category;
		this.id = id;
	}

	public static ProductFactory getStaticProduct(String name, int id, String category) {
		System.out.println("In Static Factory :" + name + " : " + id + " : " + category);
		return new ProductFactory(name, id, category);
	}

	public ProductFactory getInstanceProduct(String name, int id, String category) {
		System.out.println("In Static Factory :" + name + " : " + id + " : " + category);
		return new ProductFactory(name, id, category);
	}

	@Override
	public String toString() {
		return "ProductFactory [name=" + name + ", category=" + category + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		getStaticProduct("", 0, "");

		ProductFactory productFactory = new ProductFactory();
		productFactory.getInstanceProduct("", 0, "");
	}

}
