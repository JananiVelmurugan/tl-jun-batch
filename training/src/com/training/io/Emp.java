package com.training.io;

import java.io.Serializable;

class Emp implements Serializable {
	transient int a;
	static int b;
	String name;
	int age;

	// Default constructor
	public Emp(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}

}
