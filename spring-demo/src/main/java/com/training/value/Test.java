package com.training.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Product product = ctx.getBean("product", Product.class);
		System.out.println(product);
		ctx.close();
	}

}
