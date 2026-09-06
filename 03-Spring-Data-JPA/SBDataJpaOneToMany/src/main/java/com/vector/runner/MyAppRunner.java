 package com.vector.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Customer;
import com.vector.entity.Orders;
import com.vector.entity.OrderStatus;
import com.vector.service.CustomerService;

import jakarta.transaction.Transactional;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	CustomerService service;

	@Transactional
	@Override
	public void run(ApplicationArguments args) throws Exception {
		//saveCustomer();

		 loadCustomer();

		//removeCustomer();
	}
	

	public void saveCustomer() {
		
		// CALL addOrders
		Customer customer = new Customer();
		customer.setName("John");
		customer.setPhone(9009001L);

		List<Orders> orders = Arrays.asList(new Orders(190088L, LocalDate.of(2025, 04, 06), OrderStatus.ORDERED),
				new Orders(148870L, LocalDate.of(2025, 04, 07), OrderStatus.PROCESSED),
				new Orders(133465L, LocalDate.of(2026, 04, 02), OrderStatus.DELIVERED),
				new Orders(120021L, LocalDate.of(2025, 04, 05), OrderStatus.CANCELLED));

		customer = service.addOrders(customer, orders);

		// CALL saveCustomer
		customer = service.saveCustomer(customer);
		System.out.println("The customer is inserted with his orders to the Database");
		System.out.println("The customer id is : " + customer.getId());
		System.out.println("===============================");
	}
	
	
	

	public void loadCustomer() {
		Customer customer = service.fetchCustomerById(1L);
		System.out.println(customer.getId() + "," + customer.getName() + "," + customer.getPhone());

		List<Orders> orders = customer.getOrders(); //@Transactional required to execute complete method as one Transaction. DB connection will be open till completion of complete method
		orders.forEach(System.out::println);
	}

	
	
	public void removeCustomer() {

		service.deleteCustomerById(1L); // one to many, as cascade = CascadeType.ALL. orders also will be deleted
	}

}
