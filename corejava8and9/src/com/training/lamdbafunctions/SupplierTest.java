package com.training.lamdbafunctions;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		Supplier<Employee> empSup = () -> emp;
		System.out.println(empSup.get());

		Supplier<Employee> empSup1 = () -> new Employee(100, "tl", 23333);
		System.out.println(empSup1.get());
	}

}
