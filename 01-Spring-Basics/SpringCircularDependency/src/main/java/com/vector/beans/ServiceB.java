package com.vector.beans;

public class ServiceB {

	ServiceA servA;

	/*
	 * public ServiceB(ServiceA servA) { this.servA = servA; }
	 */
	
	public void setServA(ServiceA servA) {
		this.servA = servA;
	}

	public void f1() {
		System.out.println("In ServiceB :: f1()");
	}

	public void f2() {
		System.out.println("In ServiceB :: f2()");
		servA.m2();
	}

}
