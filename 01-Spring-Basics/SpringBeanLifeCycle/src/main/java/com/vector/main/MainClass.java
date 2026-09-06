package com.vector.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vector.beans.ServiceA;

public class MainClass {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		ServiceA serviceA = context.getBean(ServiceA.class);

		serviceA.printMessage();

		context.close();

	}
}
