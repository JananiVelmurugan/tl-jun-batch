package com.training.lambda;

public class CalculatorLambda {
	public static void main(String[] args) {

		Calculator aic = new Calculator() {

			@Override
			public int operate(int a, int b) {
				return a + b;
			}

			public int operate(int a, int b, int c) {
				return a + b + c;
			}
		};
		aic.operate(10, 10);

		Calculator add = (a, b) -> a + b;
		int resultAdd = add.operate(5, 5);

		Calculator sub = (a, b) -> a - b;
		int resultSub = sub.operate(5, 5);

		System.out.println(resultAdd);
		System.out.println(resultSub);

		Runnable obj = () -> System.out.println("Runnable Object");
		obj.run();
		// [] - index
		// () - paranthesis
		// {} - curly

//		com.training.innerclass.Calculator cal = (a, b) -> System.out.println(a + b);
//		cal.add(5, 5);

		Runnable ob = new Runnable() {
			@Override
			public void run() {

			}
		};

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {

			}
		});

	}

}
