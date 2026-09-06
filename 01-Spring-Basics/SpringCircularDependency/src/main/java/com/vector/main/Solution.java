package com.vector.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vector.beans.ServiceA;
import com.vector.beans.ServiceB;

public class Solution {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		
		 // ServiceA serviceA = context.getBean("sa", ServiceA.class); serviceA.m1();
		
		ServiceB serviceB = context.getBean("sb", ServiceB.class);
		serviceB.f2();
		 
		
	}

}
