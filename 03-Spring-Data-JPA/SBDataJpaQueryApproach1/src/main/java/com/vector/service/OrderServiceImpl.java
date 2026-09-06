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
	public Order getOrderById(Long orderId) {
		return repository.findById(orderId).get();
	}

	@Override
	public Iterable<Order> getAllOrder() {
		return repository.findAll();
	}

	@Override
	public List<Order> getOrdersByCustomerId(Long customerId) {
		return repository.findByCustomerId(customerId);
	}

	@Override
	public List<Order> getOrdersByOrderStatus(OrderStatus orderStatus) {
		return repository.findByOrderStatus(orderStatus);
	}

	@Override
	public List<Order> getOrderByDateGreaterThanPurchased(LocalDate datePurchased) {
		return repository.readByDatePurchasedGreaterThan(datePurchased);
	}

}
