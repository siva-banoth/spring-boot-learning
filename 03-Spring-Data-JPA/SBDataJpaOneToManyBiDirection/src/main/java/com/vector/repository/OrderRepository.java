package com.vector.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vector.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
