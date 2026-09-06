package com.vector.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Order;
import com.vector.entity.OrderStatus;
import com.vector.service.OrderService;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	OrderService orderService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		 // CALL getOderById(orderId), converting string to long type
		long orderId = Long.parseLong(args.getOptionValues("orderid").get(0));
		Order order = orderService.getOrderById(orderId);
		System.out.println(order);
		System.out.println("****".repeat(5));

		// CALL getAllOrders
		orderService.getAllOrder().forEach(ord -> System.out.println(ord));
		System.out.println("***".repeat(5));

		// CALL getOrdersByCustomerId(customerId)
		long customerId = Long.parseLong(args.getOptionValues("customerid").get(0));
		orderService.getOrdersByCustomerId(customerId).forEach(System.out::println);
		System.out.println("***".repeat(5));

		// CALL getOrdersByOrderStatus
		orderService.getOrdersByOrderStatus(OrderStatus.DELIVERED).forEach(System.out::println);
		System.out.println("****".repeat(5));

		// CALL getOrdersByDateGreaterThanPurchased(LocalDate datePurchased)
		orderService.getOrderByDateGreaterThanPurchased(LocalDate.of(2025, 03, 21)).forEach(System.out::println);

	}
}
