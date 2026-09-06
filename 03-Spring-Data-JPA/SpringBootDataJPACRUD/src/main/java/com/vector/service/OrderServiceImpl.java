package com.vector.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.entity.Order;
import com.vector.repositiory.OrderRepository;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repository;

	@Override
	public Order saveOrUpdate(Order order) {
		return repository.save(order);
	}

	@Override
	public Order getOrder(Long orderId) {
		Optional<Order> opt = repository.findById(orderId);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public Iterable<Order> getAllOrder() {
		return repository.findAll();
	}

	@Override
	public void deleteOrder(Long orderId) {
		repository.deleteById(orderId);
	}

}
