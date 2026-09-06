package com.vector.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	
	public void sayHello() {
		System.out.println("Hello, Welcome to SpringBoot...");
	}

}
