package com.test;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
	private int id;
	private String name;

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(10);
		employee.setName("Test");
		employee.getId();
		employee.getName();
		System.out.println(employee);
		
	}
}
