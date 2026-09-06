package com.vector.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

	@Id
	@TableGenerator(name = "gen2", table = "ID_GENERATOR", pkColumnName = "GEN_ID", valueColumnName = "GEN_VAL", pkColumnValue = "cust_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "gen2")
	private Long id;

	private String name;

	private Long phoneNumber;

}
