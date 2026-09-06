package com.vector.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.entity.Order;
import com.vector.entity.OrderStatus;
import com.vector.repositiory.OrderRepository;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repository;


	@Override
	public List<Object[]> countOrdersByCustomer() {
		return repository.fetchOrdersCountByCustomerId();
	}


	@Override
	public List<Order> readOrders(String status1, String status2) {
		return repository.getOrdersWithStatus(status1, status2);
	}


	@Override
	public List<Order> readOrdersWithCustomerIdOrDate(Long customerId, LocalDate orderDate) {
		return repository.fetchOrdersWithCustomerIdOrderDate(customerId, orderDate); 
	}

	@Override
	public void removeOrderByStatus(OrderStatus status) {
		repository.deleteOrderByStatus(status);
	}

}
