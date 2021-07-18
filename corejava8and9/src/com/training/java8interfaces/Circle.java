package com.training.java8interfaces;

public class Circle implements Shape, Dimensions {
	@Override
	public void calcArea() {
		System.out.println("Circle Area");
	}

//	@Override
	public void printD() {
//		Shape.super.printD();
//		Dimensions.super.printD();
		System.out.println("I am a 2D shape");
	}

	@Override
	public boolean isSideAvailable() {
		return false;
	}

	static void printType() {

	}
}
