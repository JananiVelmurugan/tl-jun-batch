package com.training.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

	@Bean
	public Product product() {
		Product product = new Product();
		product.setName("pencil");
		product.setPrice(200);
		return product;
	}
}
