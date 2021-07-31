package com.training.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Customer customer() {
		return new Customer();
	}

	@Bean
	public Account account() {
		return new Account(customer());
	}
	
	
}
