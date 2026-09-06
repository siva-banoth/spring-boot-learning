package com.vector.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="bc1 ")
@Lazy
@Scope("prototype")
public class BillCollector {

	@Autowired
	IPayment payment;
	
	@Value("5000")
	int amount;

	public BillCollector() {
		System.out.println("BillCollector :: zero-arg constructor");
	}

	public BillCollector(IPayment payment) {
		this.payment = payment;
		System.out.println("BillCollector :: param constructor");
	}

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void billPay() {

		String result = payment.pay();
		System.out.println(result + " , amount : " + amount);

	}

}
