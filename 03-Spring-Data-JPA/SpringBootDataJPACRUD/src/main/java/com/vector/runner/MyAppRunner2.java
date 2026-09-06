package com.vector.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Order;
import com.vector.entity.OrderStatus;
import com.vector.repositiory.OrderRepository;


//This runnner component is created to add list of orders to the DB

//@Component
public class MyAppRunner2 implements ApplicationRunner {

	@Autowired
	OrderRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		List<Order> lstOrders = new ArrayList<>();

		lstOrders.add(new Order(19003L, 102L, LocalDate.of(2025, 03, 31), OrderStatus.DELIVERED));
		lstOrders.add(new Order(19004L, 103L, LocalDate.of(2025, 03, 24), OrderStatus.CANCELLED));
		lstOrders.add(new Order(19005L, 104L, LocalDate.of(2025, 03, 25), OrderStatus.PROCESSED));
		lstOrders.add(new Order(19006L, 102L, LocalDate.of(2025, 03, 18), OrderStatus.REFUNDED));
		lstOrders.add(new Order(19007L, 101L, LocalDate.of(2025, 03, 23), OrderStatus.DELIVERED));
		lstOrders.add(new Order(19008L, 102L, LocalDate.of(2025, 03, 19), OrderStatus.DELIVERED));
		
		repo.saveAll(lstOrders);

	}

}
