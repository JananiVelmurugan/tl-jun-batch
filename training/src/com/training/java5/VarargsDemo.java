package com.training.java5;

import com.training.arrays.Product;
import com.training.inheritance.Book;
import com.training.inheritance.ScienceBook;
import com.training.inheritance.StoryBook;

public class VarargsDemo {

	VarargsDemo(Book... book) {

	}

	public static void main(String[] args) {
		Book book = new Book();
		ScienceBook sc = new ScienceBook();
		StoryBook sb = new StoryBook();
		Book bb = new ScienceBook();
		Book[] books = { book, sc, sb };
		// read(books);
		read();// new Book[]
		read(book);// new Book[1]
		read(book, sc);// new Book[2]
		read(book, sc, sb, bb);// new Book[3]

		Product product = new Product();
		read(book, product, new String("TestLeaf"), null, new Integer(10));
		int i;
		Book b;
		Product p;
		// an object is of type class
//		read(10, 20, book, sc, sb);
//		read(10, 20);
		read(books);
	}

//	static void read(Book[] books) {
//
//	}

	static void read(Book... books) {
		System.out.println("Book");
	}

	static void print(Object... objects) {

	}

	// Object[] object;
	static void read(Object... objects) {
		System.out.println("Object");
	}

	static void read(int a, int b, Book... books) {
		System.out.println("Book");
	}
}
