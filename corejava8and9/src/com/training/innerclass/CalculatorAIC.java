package com.training.innerclass;

public class CalculatorAIC {
	public CalculatorAIC() {

		Calculator aic = new Calculator() {

			@Override
			public void add(int a, int b) {
				System.out.println(a + b);

			}

			@Override
			public void sub(int c, int d) {
				System.out.println(c - d);

			}
		};
		aic.add(10, 10);
		aic.sub(15, 10);

	}

	public static void main(String[] args) {
		CalculatorAIC obj = new CalculatorAIC();
		
	}

}
