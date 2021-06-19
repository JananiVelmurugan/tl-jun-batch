package com.training.abstractdemo;

public class ScienceBook extends Book {

	public ScienceBook() {
		// super() - compiler inserts super() as a first statement in every cons
		super.id = 100;
		j = 200;
	}

	@Override
	String read() {
		// System.out.println("Reading a StoryBook");
		return "Reading a StoryBook";
	}

}
