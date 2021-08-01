package com.training.value;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:prices.properties")
public class AppConfig {

	@Inject
	Environment env;

	@Bean
	public Product product() {
		Product product = new Product();
		int pencilPrice = env.getProperty("pencil", Integer.class);
		product.setName("pencil");
		product.setPrice(pencilPrice);

		return product;
	}

}
