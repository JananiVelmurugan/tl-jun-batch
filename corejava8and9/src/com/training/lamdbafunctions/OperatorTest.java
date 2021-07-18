package com.training.lamdbafunctions;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorTest {
	public static void main(String[] args) {
		UnaryOperator<Employee> empUop = (empl) -> {
			empl.setId(100);
			empl.setOrgName("tl");
			empl.setSalary(20000);
			return empl;
		};

		System.out.println(empUop.apply(new Employee()));

		BinaryOperator<Double> empBop = (sal1, sal2) -> sal1 + sal2;
		System.out.println(empBop.apply(1000d, 1000d));

	}
}
