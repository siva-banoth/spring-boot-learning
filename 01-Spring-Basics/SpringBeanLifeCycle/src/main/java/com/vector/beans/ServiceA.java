package com.vector.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//Dependent
public class ServiceA implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private String message;

	public ServiceA() {
		System.out.println("ServiceA :: constructor");
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Dependency is injected");
	}

	public void printMessage() {
		System.out.println("message ----> " + message);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware's setBeanName()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		System.out.println("ApplicationContextAwares's setApplicationContex()");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("InitializingBean's afterPropertiesSet()");
	}

	@Override
	public void destroy() {
		System.out.println("DisposableBean's destroy()");
	}

	public void setUp() {
		System.out.println("Custom init method :: setUp");
	}

	public void tearDown() {
		System.out.println("Custom destory method :: tearDown");
	}
}
