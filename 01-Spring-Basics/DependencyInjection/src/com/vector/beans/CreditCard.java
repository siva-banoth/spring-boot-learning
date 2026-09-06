package com.vector.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class CreditCard implements IPayment {
	
	static {
		System.out.println("CreditCard class is loading ...");
	}
	
	public CreditCard() {
		System.out.println("CreditCard :: zero arg constructor");
	}
	
	public String pay() {
		return "Payment done through CreditCard";
	}

}
