package com.vector.repositiory;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vector.entity.Order;
import com.vector.entity.OrderStatus;

import jakarta.transaction.Transactional;

public interface OrderRepository extends CrudRepository<Order, Long> {

	@Query(value = "SELECT * FROM orders WHERE STATUS = ? OR STATUS = ?", nativeQuery = true)
	List<Order> getOrdersWithStatus(String status1, String status2);

	@Query(value = "SELECT o FROM Order o WHERE o.customerId = ?1 OR o.datePurchased = ?2")
	List<Order> fetchOrdersWithCustomerIdOrderDate(Long customerId, LocalDate orderDate);

	@Query(value = "SELECT CUSTOMER_ID, COUNT(CUSTOMER_ID) AS ORDER_COUNT FROM orders GROUP BY CUSTOMER_ID", nativeQuery = true)
	List<Object[]> fetchOrdersCountByCustomerId();

	@Query(value = "DELETE FROM Order o WHERE o.orderStatus = ?1 ")
	@Modifying
	@Transactional
	void deleteOrderByStatus(OrderStatus status);
}
