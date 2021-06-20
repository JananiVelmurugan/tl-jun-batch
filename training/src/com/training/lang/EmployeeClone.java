package com.training.lang;

public class EmployeeClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee(101, "Test");
		Class name = emp.getClass();
		System.out.println(name);
		emp.setDept(new Department());
		
		Employee emp2 = (Employee) emp.clone();
		System.out.println(emp);
		System.out.println(emp2);

		System.out.println(emp.getDept());
		System.out.println(emp2.getDept());

	}

}
