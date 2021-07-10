package com.training.collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Test");
		Employee emp2 = new Employee(102, "Leaf");
		Employee emp3 = new Employee(102, "Chennai");

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);

	
		System.out.println(set);
	}

}
