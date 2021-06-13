package com.training.inheritance;

public class Book {
	int id = 0;
	String name = "undefined";
	
	public Book() {
		System.out.println("Book Default Cons");
	}
	public Book(int pageCount) {
		System.out.println("Book Single Arg Cons");
	}

	void read() {
		System.out.println("I am reading a book");
	}
}
