package com.training.lang;

public class EmployeeEquality {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Test");
		Employee emp2 = new Employee(102, "Leaf");
//		System.out.println("emp1 is equal to emp2");
		// obj reference equality
//		System.out.println(emp1 == emp2);
		// obj fields equality
//		System.out.println(emp1.equals(emp2));
		System.out.println("emp1 is equal to emp3");
		Employee emp3 = new Employee(101, "Test");
		System.out.println(emp1.toString());
		System.out.println(emp3);
//		System.out.println(emp1 == emp3);
		System.out.println(emp1.equals(emp3));

	}

}
