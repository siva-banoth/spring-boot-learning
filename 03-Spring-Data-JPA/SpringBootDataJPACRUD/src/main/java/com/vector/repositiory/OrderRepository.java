package com.vector.repositiory;

import org.springframework.data.repository.CrudRepository;

import com.vector.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>  {
	
	

}
