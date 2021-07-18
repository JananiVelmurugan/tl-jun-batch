package com.training.java8interfaces;

public class ShapeTest {
	public static void main(String[] args) {
		Shape c = new Circle();
		Shape s = new Square();

		c.calcArea();
		System.out.println(c.isSideAvailable());

		s.calcArea();
		System.out.println(s.isSideAvailable());

		Shape.printType();
	}

}
