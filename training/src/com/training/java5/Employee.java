package com.training.java5;

public class Employee {
	private int id;
	private String name;
	private Gender gender;
//	private static final String MALE="MALE";
//	private static final String FEMALE="FEMALE";

	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 10;
		employee.name = "Test";
		employee.gender = Gender.FEMALE;

		for (Gender g : Gender.values()) {
			System.out.println(g + "->" + g.ordinal());
		}
	}

}
