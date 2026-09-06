package com.vector.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Customer;
import com.vector.entity.Order;
import com.vector.entity.OrderStatus;
import com.vector.service.OrderService;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	OrderService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// saveCustomer();

		fetchOrder(148870L);

	}

	private void fetchOrder(long l) {

		Order order = service.loadOrder(l);

		System.out.println("order id : " + order.getOrderId());
		System.out.println("date purchaed : " + order.getDatePurchased());
		System.out.println("order status : " + order.getOrderStatus());
		System.out.println("customer id : " + order.getCustomer().getId());
		System.out.println("customer name : " + order.getCustomer().getName());
		System.out.println("phone : " + order.getCustomer().getPhone());

	}

	private void saveCustomer() {

		// create customer
		Customer customer = new Customer();
		customer.setName("John");
		customer.setPhone(9009001L);

		// create orders
		// null - as we r using @AllArgsConstructor in Order class, Customer parameter
		// also we need to add
		Order order1 = new Order(190087L, LocalDate.of(2025, 04, 06), OrderStatus.ORDERED, null);
		Order order2 = new Order(148870L, LocalDate.of(2025, 04, 07), OrderStatus.PROCESSED, null);
		Order order3 = new Order(133465L, LocalDate.of(2026, 04, 02), OrderStatus.DELIVERED, null);

		// orders are aware of their customer
		order1 = service.addCustomer(customer, order1);
		order2 = service.addCustomer(customer, order2);
		order3 = service.addCustomer(customer, order3);

		// customer is aware of orders
		List<Order> orders = Arrays.asList(order1, order2, order3);
		customer = service.addOrders(customer, orders);

		service.saveCustomer(customer);
		System.out.println("Customer with Orders are placed into the Database");
		System.out.println("The customer id generated is :: " + customer.getId());
		System.out.println("========".repeat(5));

	}

}
