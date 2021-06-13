package com.training.oops;

public class Addition {
	void add(int a, int b) {
		System.out.println(a + b);
	}

//	int add(int a, int b) {
//		return a + b;
//	}

	void add(String firstName, String lastName) {
		System.out.println(firstName + lastName);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void add(int age, String name) {

	}

	void add(String name, int age) {

	}

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add("Test", "Leaf");
		obj.add(10, 20);
		obj.add(10, 20, 30);
	}
}
