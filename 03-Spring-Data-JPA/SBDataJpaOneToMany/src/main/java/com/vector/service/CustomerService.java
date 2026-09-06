package com.vector.service;

import java.util.List;

import com.vector.entity.Customer;
import com.vector.entity.Orders;

public interface CustomerService {

	Customer addOrders(Customer customer, List<Orders> orders);

	Customer saveCustomer(Customer customer);

	void deleteCustomerById(Long id);

	Customer fetchCustomerById(Long id);
}
