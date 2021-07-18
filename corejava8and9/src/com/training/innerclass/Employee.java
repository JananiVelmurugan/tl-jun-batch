package com.training.innerclass;

public class Employee {

	private static Employee emp = new Employee();

	private Employee() {
	}

	public static Employee getEmployee() {
		return emp;
	}

}
