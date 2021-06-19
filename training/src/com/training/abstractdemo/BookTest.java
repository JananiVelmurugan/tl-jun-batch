package com.training.abstractdemo;

public class BookTest {
	public static void main(String[] args) {
		// without object substitution
		Book b = new ScienceBook();
		ScienceBook sb = new ScienceBook();
		StoryBook st = new StoryBook();
		review(sb);
		review(st);
		review(b);

		// with object substitution
		Book bb;
		bb = new ScienceBook();
		review(bb);
		System.out.println(bb.read());
		System.out.println(bb.id);
		System.out.println(Book.j);
		bb = new StoryBook();
		review(bb);
		System.out.println(bb.read());
		System.out.println(bb.id);
		System.out.println(Book.j);
	}

//	static void review(ScienceBook b) {
//		// author1
//		// author2
//	}
//
//	static void review(StoryBook b) {
//		// author1
//		// author2
//	}

	static void review(Book b) {
		// author1
		// author2
		System.out.println(b);
	}
}
