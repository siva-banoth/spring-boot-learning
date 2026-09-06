package com.vector.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Order;
import com.vector.entity.OrderStatus;
import com.vector.service.OrderService;

//@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	OrderService orderService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Calling saveOrUpate(order)
		Order order = new Order(19002L, 102L, LocalDate.now(), OrderStatus.PROCESSED);
		orderService.saveOrUpdate(order);
		System.out.println("Order saved successfully!");
		
		System.out.println("===".repeat(10));
		
		
		// Calling getOder(orderId)
		//	Order o = orderService.getOrder(19001L);		
		//	System.out.println(o);
		
		
		// Calling getAllOrders()
		Iterable<Order> iterable = orderService.getAllOrder();
		iterable.forEach(ord -> System.out.println(ord));
		
		
		
	}

}
