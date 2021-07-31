package com.training.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Demo {
	public static void main(String[] args) {
//		Eager Loading
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("demo1.xml");

		Account account = ctx.getBean("account", Account.class);
		System.out.println(account);
		account.getCustomer().pay();

		Account accountCopy = ctx.getBean("account", Account.class);
		System.out.println(accountCopy);

		Account account1 = ctx.getBean("account1", Account.class);
		System.out.println(account1);

		Customer customer = ctx.getBean("customer", Customer.class);
		customer.setName("Test");
		System.out.println(customer);

		// Tightly Coupled
		// Customer customer = new Customer();

		// Loosely Coupled 
		// Customer customer = new CCCustomer();
		ctx.close();

//		Lazy Loading
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("demo1.xml"));
	}

}
