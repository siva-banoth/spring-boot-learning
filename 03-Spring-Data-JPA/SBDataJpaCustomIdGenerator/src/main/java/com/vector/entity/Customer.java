package com.vector.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
	
	@Id
	@GenericGenerator(name = "custom-generator", strategy = "com.vector.generator.IdGenerator")
	@GeneratedValue(generator = "custom-generator")
	private Long id;
	
	private String name;
	
	private Long phoneNumber;

}
