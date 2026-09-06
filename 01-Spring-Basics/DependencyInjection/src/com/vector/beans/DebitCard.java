package com.vector.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class DebitCard implements IPayment {
	
	static {
		System.out.println("DebitCard class is loading...");
	}
	public DebitCard() {
		System.out.println("DebitCard :: zero-arg consturctor");
	}
	
	public String pay() {
		return "Payment done through DebitCard";
	}

}
