package com.training.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("constructor.xml");
	
		Product product = ctx.getBean("product", Product.class);
		System.out.println(product);
		
		ProductFactory productFactory = ctx.getBean("productFactory", ProductFactory.class);
		System.out.println(productFactory);
		
		ProductFactory productInstanceFactory = ctx.getBean("productInstanceFactory", ProductFactory.class);
		
		System.out.println(productInstanceFactory);
		ctx.close();

	}

}
