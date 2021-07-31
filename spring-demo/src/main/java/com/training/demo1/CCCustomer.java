package com.training.demo1;

public class CCCustomer extends Customer {

	@Override
	public void pay() {
		System.out.println("CC Customer Pay");
	}
}
