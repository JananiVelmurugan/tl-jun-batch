package com.training.oops;

public class VariableDemo {
	int instanceVar;
	static int staticVar;
	final int finalVar = 100;
	static final int sFVar = 1000;

	void print() {
		int localVar = 200;
		System.out.println(instanceVar);
		System.out.println(staticVar);
		System.out.println(finalVar);
		System.out.println(sFVar);
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
	}

}
