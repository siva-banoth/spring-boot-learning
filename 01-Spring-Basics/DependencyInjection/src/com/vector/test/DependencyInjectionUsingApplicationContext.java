package com.vector.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vector.beans.BillCollector;

public class DependencyInjectionUsingApplicationContext {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/vector/config/springbeans.xml");
		System.out.println("******** ApplicationContext container is loaded *******");

		System.out.println();

		BillCollector billCollector = context.getBean(BillCollector.class);
		billCollector.billPay();

	}
}
