package com.training.s;

public class InventoryView {

	SingleResponsibilityBook book;

	public InventoryView(SingleResponsibilityBook book) {
		this.book = book;
	}

	void searchBook() {
		book.getAuthor();
		book.getTitle();
	}

}