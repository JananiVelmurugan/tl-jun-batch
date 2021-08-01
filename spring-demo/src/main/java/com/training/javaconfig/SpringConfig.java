package com.training.javaconfig;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

	// @Bean("customer")
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	// Customer customer = new Customer();
	public Customer customer() {
		return new Customer();
	}


}
