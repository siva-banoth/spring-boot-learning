package com.vector.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value="com.vector")
@PropertySource("email.properties")
@PropertySource("database.properties")
public class AppConfig {

	
	
}
