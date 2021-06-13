package com.training.inheritance;

public class ScienceBook extends Book {
	int id = 10;
	String name = "Science";

	public ScienceBook() {
		super();
//		super(100);
//		this(100);
		System.out.println("ScienceBook Default Cons");
//		super(100);
	}

	public ScienceBook(int pageCount) {
		// super();
	}

	@Override
	void read() {
		System.out.println("I am reading a ScienceBook");
	}

	void buy() {
		System.out.println("I am buying a new ScienceBook");
	}

}
