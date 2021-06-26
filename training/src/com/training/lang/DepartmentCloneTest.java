package com.training.lang;

public class DepartmentCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {

		Department d1 = new Department(2001, "Dev");
		Department d2 = (Department) d1.clone();
		System.out.println(d1);
		System.out.println(d2);
	}
}
