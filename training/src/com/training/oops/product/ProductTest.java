package com.training.oops.product;

public class ProductTest {

	public static void main(String[] args) {
		Product product = new Product();
		System.out.println(product.getId());
		System.out.println(product.getName());
		product.setId(101);
		product.setName("Mobile");
		System.out.println(product.getId());
		System.out.println(product.getName());
		product.id = -101;
		System.out.println(product.id);

	}

}
