package com.training.inheritance;

public class ScienceBook extends Book {
	int id = 10;
	String name = "Science";

	@Override
	void read() {
		System.out.println("I am reading a ScienceBook");
	}
	
	void buy() {
		System.out.println("I am buying a new ScienceBook");
	}

}
