package com.vector.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vector.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
