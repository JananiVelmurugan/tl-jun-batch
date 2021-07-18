package com.training.lamdbafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateTest {
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

		// google employees
		// prior to lambda
		System.out.println("Prior to Lambda");
		for (Employee employee : empList) {
			if (employee.getOrgName().equals("google")) {
				System.out.println(employee);
			}
		}

		// lambda
		Predicate<Employee> googleEmp = (empl) -> empl.getOrgName().equals("google");
		boolean result = googleEmp.test(emp);
		System.out.println(result);

		System.out.println("Using Lambda to print google emp");
		printEmp(empList, googleEmp);

		Predicate<Employee> salEmp = (empl) -> empl.getSalary() > 20000;
		System.out.println("Using Lambda to print emp sal > 20000");
		printEmp(empList, salEmp);

		System.out.println("Using Lambda to print google emp & sal > 40000");
		Predicate<Employee> googleSalEmp = googleEmp.and(salEmp);
		printEmp(empList, googleSalEmp);

		IntPredicate idEmp = (id) -> id == 1;
		Predicate<Employee> idEmpPredicate = (empl) -> empl.getId() == 1;

	}

	private static void printEmp(List<Employee> list, Predicate<Employee> predicate) {
		for (Employee employee : list) {
			if (predicate.test(employee)) {
				System.out.println(employee);
			}
		}
	}

}
