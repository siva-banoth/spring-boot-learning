package com.vector.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vector.beans.BillCollector;
import com.vector.config.AppConfig;

public class DIUsingAnnotations {
	public static void main(String[] args) {

		ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);

		BillCollector collector = context1.getBean("bc1", BillCollector.class);
		System.out.println(collector.hashCode());
		
		AppConfig config = context1.getBean(AppConfig.class);
		BillCollector collector2 = config.createCollector();
		System.out.println(collector2.hashCode());
		
	}
	

}
