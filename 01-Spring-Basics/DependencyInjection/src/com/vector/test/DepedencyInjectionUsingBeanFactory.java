package com.vector.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.vector.beans.BillCollector;

public class DepedencyInjectionUsingBeanFactory {
	public static void main(String[] args) {
		
		
			
		FileSystemResource resource  = new FileSystemResource("src/com/vector/config/springbeans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("**** BeanFactory container is loaded ****");
		
		BillCollector billCollector = factory.getBean(BillCollector.class);
		billCollector.billPay();
		
	}
}
