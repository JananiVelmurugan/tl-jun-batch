
package com.training.composite;

public class Circle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color "+fillColor);
	}

}
