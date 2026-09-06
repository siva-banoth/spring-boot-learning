package com.vector.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vector.bean.WelcomeBean;

public class Solution {

	public static void main(String[] args) {

		// STEP 1 : START THE SPRING CONTAINER
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// STEP 2 : GET THE BEAN(OBJECT) FROM THE CONTAINER
		WelcomeBean bean = context.getBean(WelcomeBean.class);

		// STEP 3 : CALL THE METHOD
		String msg = bean.sayWelcome();
		System.out.println(msg);
	}

}
