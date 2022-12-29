package com.accenture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Add these 2 @ to allow use of BeanConfig
@Configuration
//@ComponentScan(basePackages = "com.accenture")

public class BeanConfig {
	@Bean("address")
	public Address addressBean() {
		Address address = new Address();
		return address;
	}
}
