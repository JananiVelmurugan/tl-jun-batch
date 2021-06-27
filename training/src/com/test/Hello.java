package com.test;

class Hello<T> {
	public static void main(String[] args) {
		System.out.println("Hello Test Leaf");
	}

	public <R> void display(R r, T... t) {
		System.out.println(t);
	}

}