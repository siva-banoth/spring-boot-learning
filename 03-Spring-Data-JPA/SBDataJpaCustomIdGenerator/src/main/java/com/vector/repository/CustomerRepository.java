package com.vector.repository;

import org.springframework.data.repository.CrudRepository;

import com.vector.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
