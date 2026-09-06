package com.vector.runner;

import java.time.LocalDate;
import java.util.List;

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
		
		System.out.println("*+*+*".repeat(30));
		
		//CALL readOrders(status1, status2)
		List<Order> lstOrders = orderService.readOrders(OrderStatus.PROCESSED.getValue(), OrderStatus.ORDERED.getValue());
		lstOrders.forEach(o -> System.out.println(o));
		
		System.out.println("*+*+*".repeat(30));

		// CALL countOrdersByCustomer()
		List<Object[]> lstObjArray = orderService.countOrdersByCustomer();
		lstObjArray.forEach(obj -> System.out.println(obj[0]+ " "+obj[1 ]));
		
		System.out.println("*+*+*".repeat(30));
		
		// CALLING readOrdersWithCustomerIdOrDate()
		List<Order> orders = orderService.readOrdersWithCustomerIdOrDate(102L, LocalDate.of(2025, 03, 21));
		orders.forEach(o -> System.out.println(o));
		
		System.out.println("*+*+*".repeat(30));

		//CALLING removeOrderByStatus
		orderService.removeOrderByStatus(OrderStatus.CANCELLED);

	}
}
