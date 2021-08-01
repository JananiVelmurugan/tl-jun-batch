package com.training.javaconfig;

import javax.inject.Named;

//@Component
//@Named("cus")
@Named
public class Customer {

	private String name;

	public void pay() {
		System.out.println("Customer Pay");
	}

	public Customer() {
		System.out.println("Customer Cons");
	}

	public Customer(String name) {
		System.out.println("Customer Param Cons");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}

}
