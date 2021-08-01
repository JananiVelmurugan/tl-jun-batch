package com.training.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		ctx.getEnvironment().setActiveProfiles("prod");
		ctx.register(AppConfig.class, DevConfig.class, ProdConfig.class);
		ctx.refresh();

		Product product = ctx.getBean("product", Product.class);
		System.out.println(product);

		ctx.close();
	}

}
