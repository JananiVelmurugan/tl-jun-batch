package com.training.collection;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
		numbers.put("one", 1);
		// hash - 100
		// index - 1
		numbers.put("two", 2);
		// hash - 200
		// index - 4
		numbers.put("three", 3);
		// hash - 300
		// index - 4
		numbers.put("one", 10);
		// hash - 100

		System.out.println(numbers);
		System.out.println(numbers.get("one"));
	}

}
