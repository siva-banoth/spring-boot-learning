package com.vector.service;

import java.util.List;

import com.vector.entity.Customer;
import com.vector.entity.Order;

public interface OrderService {
	
	// customer and order, both should aware of each other. then only FK will be updated
	Customer addOrders(Customer customer, List<Order> orders); // adds orders to customer
	Order addCustomer(Customer customer, Order order);  // adds customer to order
	
	Customer saveCustomer(Customer customer);
	
	Order loadOrder(Long id);
}
