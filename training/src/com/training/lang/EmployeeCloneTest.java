package com.training.lang;

public class EmployeeCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee(101, "Test");
		Department dept = new Department(1001,"Training");
		
		emp.setDept(dept);
		System.out.println(emp);
		System.out.println(emp.getId());
		System.out.println(emp.getDept());
		System.out.println(emp.getDept().getId());
		

		Employee emp2 = (Employee) emp.clone();
		System.out.println(emp2);
		System.out.println(emp2.getId());
		System.out.println(emp2.getDept());
		System.out.println(emp2.getDept().getId());
		
		System.out.println("Modifying the emp fields");
		emp.setId(102);
		System.out.println(emp.getId());
		System.out.println(emp2.getId());
		
		Department dept2 = new Department(1002,"Testing");
		emp.setDept(dept2);
		System.out.println(emp.getDept().getId());
		System.out.println(emp2.getDept().getId());

	}

}
