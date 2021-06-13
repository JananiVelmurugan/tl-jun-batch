package com.training.oops;

public class VariableDemo {
	int instanceVar;
	static int staticVar;
	final int finalVar = 100;
	static final int sFVar = 1000;

	void print() {
		int localVar = 200;
		System.out.println(instanceVar);
		instanceVar = 10;
		System.out.println(staticVar);
		staticVar = 20;
		System.out.println(finalVar);
//		finalVar = 30;
		System.out.println(sFVar);
//		sFVar = 40;
		System.out.println(localVar);
	}

	static void display() {
		int localVar = 300;
		VariableDemo demo = new VariableDemo();
		System.out.println(demo.instanceVar);
		System.out.println(staticVar);
		System.out.println(demo.finalVar);
		System.out.println(sFVar);
		System.out.println(localVar);
		VariableDemo demo1 = new VariableDemo();
		System.out.println(demo1.finalVar);
//		demo.finalVar = 10;
//		demo1.finalVar= 20;
	}

}
