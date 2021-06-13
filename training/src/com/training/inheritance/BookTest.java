package com.training.inheritance;

public class BookTest {
	public static void main(String[] args) {

		System.out.println("Book");
		Book book = new Book();
		System.out.println(book.id);
		System.out.println(book.name);
		book.read();
		System.out.println("Science Book");
//		ScienceBook scienceBook = new ScienceBook();
		Book scienceBook = new ScienceBook();
		System.out.println(scienceBook.id);
		System.out.println(scienceBook.name);
		scienceBook.read();
//		scienceBook.buy();
		System.out.println("Story Book");
//		StoryBook storyBook = new StoryBook();
		Book storyBook = new StoryBook();
		System.out.println(storyBook.id);
		System.out.println(storyBook.name);
		storyBook.read();

	}

}
