package com.vector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.vector.beans.BillCollector;

@Configuration
@ComponentScan(value="com.vector")
public class AppConfig {
	
	
	@Bean(value="bc1")
	@Scope(value="prototype")
	
	public BillCollector createCollector() {
		return new BillCollector();
	}

}
