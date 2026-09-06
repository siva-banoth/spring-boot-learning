package com.vector.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.entity.Customer;
import com.vector.entity.Order;
import com.vector.repository.CustomerRepository;
import com.vector.repository.OrderRepository;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	OrderRepository orderRepo;

	@Override
	public Customer addOrders(Customer customer, List<Order> orders) {
		customer.setLstOrder(orders);
		return customer;
	}

	@Override
	public Order addCustomer(Customer customer, Order order) {
		order.setCustomer(customer);
		return order;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		customer = customerRepo.save(customer);
		return customer;
	}

	@Override
	public Order loadOrder(Long id) {
		Optional<Order> optional = orderRepo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}
