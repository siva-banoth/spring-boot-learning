package com.vector.service;

import java.time.LocalDate;
import java.util.List;

import com.vector.entity.Order;
import com.vector.entity.OrderStatus;

public interface OrderService {

	List<Order> readOrders(String  status1, String status2);

	List<Order> readOrdersWithCustomerIdOrDate(Long customerId, LocalDate orderDate);

	List<Object[]> countOrdersByCustomer();
	
	void removeOrderByStatus(OrderStatus status);

}
