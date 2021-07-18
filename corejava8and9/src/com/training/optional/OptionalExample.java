package com.training.optional;

import java.util.Optional;

import com.training.lambda.Employee;

public class OptionalExample {

	public OptionalExample() {
		// null check
		Employee emp = new Employee(10, "paypal", 12000);
//		Employee emp = null;
//		emp.getId();
		if (emp != null) {
			emp.getOrgName();
		}
		// Employee emp1 = null;
		Employee emp1 = new Employee(10, "paypal", 12000);

		// return optional emp obj if emp is not null
		// return empty optional obj if emp is null
		Optional<Employee> op = Optional.ofNullable(emp1);
		System.out.println(op);

		// Optional<Share> ops = Optional.ofNullable(share);
		Employee empOne = op.orElseGet(() -> new Employee());
		System.out.println(empOne);

		if (op.isPresent()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static void main(String[] args) {
		OptionalExample ex = new OptionalExample();
	}
}
