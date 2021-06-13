package com.training.inheritance;

public class StoryBook extends Book {
	int id = 20;
	String name = "Story";

	@Override
	void read() {
		System.out.println("I am reading a StoryBook");
	}

	void buy() {
		System.out.println("I am buying a new StoryBook");
	}
}
