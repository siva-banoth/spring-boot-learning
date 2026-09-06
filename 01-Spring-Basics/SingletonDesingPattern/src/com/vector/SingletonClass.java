package com.vector;

public class SingletonClass {

	private static SingletonClass singleton;

	private SingletonClass() {
		System.out.println("SingletonClass : zero-arg constructor");

	}

	public synchronized static SingletonClass getInstance() {
		
		if(singleton==null) {
			 singleton = new SingletonClass();
		}
		
		return singleton;
	}

}
