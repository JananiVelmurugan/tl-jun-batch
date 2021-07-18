package com.training.lamdbafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

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

		Consumer<Employee> empCons = (empl) -> System.out.println(empl.getSalary() + 10000);
		empCons.accept(emp);

		Consumer<Employee> empCons1 = (empl) -> System.out.println(empl.getSalary() + 20000);
		empCons1.accept(emp1);

		Consumer<Employee> empConsu = empCons.andThen(empCons1);
		empList.forEach(empConsu);

//		for (Employee employee : empList) {
//			System.out.println(employee);
//			System.out.println(employee);
//		}

	}

}
