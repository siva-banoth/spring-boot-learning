package com.vector.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vector.beans.ReportManager;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		ReportManager reportManager = context.getBean(ReportManager.class);
		
		reportManager.printReport(20);
		
	}

}
