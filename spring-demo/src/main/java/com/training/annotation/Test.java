package com.training.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class);

		Customer customer = ctx.getBean("customer", Customer.class);
		Account account = ctx.getBean("account", Account.class);
		customer.setName("Test");
		System.out.println(customer);
		System.out.println(account);

		ctx.close();

	}
}
