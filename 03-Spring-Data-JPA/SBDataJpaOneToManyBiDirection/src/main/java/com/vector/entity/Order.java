package com.vector.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="orders")
public class Order {

	@Id
	@Column(name = "ORDER_ID")
	private Long orderId;

	@Column(name = "DATE_PURCHASED")
	private LocalDate datePurchased;
            
	@Enumerated(value = EnumType.STRING)
	@Column(name = "STATUS")
	private OrderStatus orderStatus;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID")  // specifies the foreign key
	private Customer customer;   // to navigate from order to customer

}
