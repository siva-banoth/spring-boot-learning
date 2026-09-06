package com.vector.service;

import com.vector.entity.Order;

public interface OrderService {
	
	Order saveOrUpdate(Order order);
	
	Order getOrder(Long orderId);
	
	Iterable<Order> getAllOrder();
	
	void deleteOrder(Long orderId);
}
