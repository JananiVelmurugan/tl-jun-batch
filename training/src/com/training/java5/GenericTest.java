package com.training.java5;

import com.training.arrays.Product;
import com.training.inheritance.Book;

public class GenericTest {
	public static void main(String[] args) {
		Book book = new Book();
		Product prod = new Product();
//		print(book, prod);
//		print(prod, book);
//		print(new StoryBook(), new Product());

		Generics<Book, Product, String> g = new Generics<>();
		g.print(new Book(), new Product());
		g.review(new Book(), new String());

		Generics<Product, Book, String> gg = new Generics<>();
		gg.print(new Product(), new Book());
		gg.review(new Product(), new String());
	}

}
