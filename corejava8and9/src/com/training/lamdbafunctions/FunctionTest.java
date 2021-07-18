package com.training.lamdbafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1, "google", 22342.23);
		Employee emp1 = new Employee(2, "ebay", 42342.23);
		Employee emp2 = new Employee(3, "google", 12342.23);
		Employee emp3 = new Employee(4, "ebay", 62342.23);
		Employee emp4 = new Employee(5, "google", 25342.23);
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		System.out.println(empList);

		Function<Employee, String> orgFunction = (empl) -> {
			System.out.println("Inside function");
			return empl.getOrgName().toUpperCase();
		};

		String result = orgFunction.apply(emp);
		System.out.println(result);

		Function<Employee, Employee> orgFunction1 = (empl) -> {
			System.out.println("function1");
			empl.setOrgName(empl.getOrgName().toUpperCase());
			return empl;
		};
		Function<Employee, Employee> orgFunction2 = (empl) -> {
			System.out.println("function2");
			empl.setOrgName(empl.getOrgName().toLowerCase());
			return empl;
		};
		System.out.println("and then");
		System.out.println(orgFunction1.andThen(orgFunction2).apply(emp));

		System.out.println("compose");
		System.out.println(orgFunction1.compose(orgFunction2).apply(emp));
	}
}
