package com.vector.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class UPI implements IPayment {
	
	static {
		System.out.println("UPI class is laoding...");
	}
	
	public UPI() {
		System.out.println("UPI : zero-arg constructor");
	}

	@Override
	public String pay() {
		return "Payment done through UPI";
	}

}
