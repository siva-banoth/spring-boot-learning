package com.vector;

public class Main {
	public static void main(String[] args) {
		
		
		SingletonClass instance = SingletonClass.getInstance();
		System.out.println(instance.hashCode());
		
		
	}

}
