package com.vector.service;

import java.time.LocalDate;
import java.util.List;

import com.vector.entity.Order;
import com.vector.entity.OrderStatus;

public interface OrderService {
	
	
	Order getOrderById(Long orderId);
	
	Iterable<Order> getAllOrder();
	
	List<Order> getOrdersByCustomerId(Long customerId);
	
	List<Order> getOrdersByOrderStatus(OrderStatus orderStatus);
	
	List<Order> getOrderByDateGreaterThanPurchased(LocalDate datePurchased);
	
}
