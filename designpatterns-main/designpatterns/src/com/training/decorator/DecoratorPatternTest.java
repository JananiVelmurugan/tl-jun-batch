package com.training.decorator;
public class DecoratorPatternTest {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		//Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		Car sportsLuxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}