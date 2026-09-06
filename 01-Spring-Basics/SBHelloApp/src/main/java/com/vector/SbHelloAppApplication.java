package com.vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vector.bean.HelloBean;

@SpringBootApplication
public class SbHelloAppApplication {

	@Autowired
	static HelloBean helloBean;
	
	public static void main(String[] args) {
		SpringApplication.run(SbHelloAppApplication.class, args);
		
		helloBean.sayHello();
	}

}
