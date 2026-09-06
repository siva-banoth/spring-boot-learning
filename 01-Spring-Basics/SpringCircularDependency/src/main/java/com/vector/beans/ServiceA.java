package com.vector.beans;

public class ServiceA {
	
	ServiceB servB;
	
	public ServiceA(ServiceB servB) {
		this.servB = servB;
	}

	/*
	 * public void setServB(ServiceB servB) { this.servB = servB; }
	 */
	
	public void m1() {
		System.out.println("In ServiceA :: m1()");
		servB.f1();
	}
	
	public void m2() {
		System.out.println("In ServiceA :: m2()");
	}
}
