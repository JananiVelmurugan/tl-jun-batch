package com.test;

public class HelloTest {
	public static void main(String[] args) {
		Hello<String> obj = new Hello<>();
		obj.display(new Employee(), "Test", "Leaf");
		obj.display(new Employee(), "Test");
		obj.display(new Employee());
	}

}
