package com.vector.config;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vector.model.Plan;

@Configuration
@ComponentScan(value="com.vector")
public class AppConfig {

	@Bean
	public HashMap<String, Plan> hashMap() {

		HashMap<String, Plan> hm = new HashMap<>();

		hm.put("p-101", new Plan("p-101", "1GB/day, 100SMS/day", 399, "28 Days"));
		hm.put("p-102", new Plan("p-102", "1.5GB/day, 100SMS/day", 599, "36 Days"));
		hm.put("p-103", new Plan("p-103", "2GB/day, 100SMS/day", 399, "56 Days"));

		return hm;
	}
}
