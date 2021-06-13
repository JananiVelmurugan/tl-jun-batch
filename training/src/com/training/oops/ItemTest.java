package com.training.oops;

public class ItemTest {
	public static void main(String[] args) {
		Item item1 = new Item(20, "Pen", 230);
		System.out.println(item1.getId());
		System.out.println(item1.getName());
		System.out.println(item1.getCost());

	}
}
