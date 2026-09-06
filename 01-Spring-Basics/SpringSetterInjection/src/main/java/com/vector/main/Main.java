package com.vector.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vector.beans.UserService;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Object obj = context.getBean("uService");
		UserService userService = (UserService) obj;

		System.out.println("Calling saveUser..");
		userService.saveUser("ashokIT", "ashokIT@123");

		System.out.println("===========================");

		System.out.println("Calling fetchUser()");
		userService.fetchUser("ashokIT");

	}

}
