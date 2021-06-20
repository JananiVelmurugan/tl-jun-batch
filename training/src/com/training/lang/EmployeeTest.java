package com.training.lang;

import java.util.Arrays;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Test");
		Employee emp2 = new Employee(102, "Leaf");
		Employee emp3 = new Employee(103, "TestLeaf");
		Employee[] employees = { emp1, emp2, emp3 };
		System.out.println(employees);
		System.out.println(employees.toString());
		System.out.println(Arrays.toString(employees));

		for (Employee e : employees) {
			if (e.getId() == 103) {
				System.out.println(e);
			}
		}
		// int -> String
		int i = 10;
		String s = String.valueOf(i);
		Integer j = Integer.parseInt(s);
		System.out.println(j.toString());

		System.out.println(emp1);
		// System.out.println(emp1.toString());
		System.out.println(emp2);
		// System.out.println(emp2.toString());
		System.out.println(emp3);
//		System.out.println(emp3.toString());

//		System.out.println(emp1.print());
//		System.out.println(emp2.print());
//		System.out.println(emp3.print());

		Manager mgr = new Manager();
		System.out.println(mgr);
	}
}
