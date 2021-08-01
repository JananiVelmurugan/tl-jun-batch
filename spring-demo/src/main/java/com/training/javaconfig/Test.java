package com.training.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.demo1.CCCustomer;
import com.training.demo1.Customer;
import com.training.demo1.Account;

public class Test {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class);

		Customer customer = ctx.getBean("customer", Customer.class);
		Account account = ctx.getBean("account", Account.class);
		customer.setName("Test");
		System.out.println(customer);
		System.out.println(account);

		CCCustomer cccustomer = ctx.getBean("ccCustomer", CCCustomer.class);
		System.out.println(cccustomer);

		ctx.close();
	}
}
