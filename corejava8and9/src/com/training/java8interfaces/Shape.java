package com.training.java8interfaces;

public interface Shape {
	// any interface field by default it's public static final
	// allowed modifiers - public, static, final
	int s = 2;

	// any interface method by default it's public abstract
	// allowed modifiers - public, static, default, abstract
	void calcArea();

	static void printType() {
		System.out.println("I am a shape");
	}

	void printD();

//	default void printD() {
//		System.out.println("Undefined");
//	}

	default boolean isSideAvailable() {
		return true;
	}

}
