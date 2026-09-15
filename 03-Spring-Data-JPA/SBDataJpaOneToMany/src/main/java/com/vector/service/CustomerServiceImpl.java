package com.vector.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.entity.Customer;
import com.vector.entity.Orders;
import com.vector.repository.CustomerRepository;

@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repository;

	@Override
	public Customer addOrders(Customer customer, List<Orders> orders) {
		customer.setOrders(orders);
		return customer;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		customer = repository.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomerById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Customer fetchCustomerById(Long id) {
		Customer customer = repository.findById(id).get();
		return customer;
	}

}
