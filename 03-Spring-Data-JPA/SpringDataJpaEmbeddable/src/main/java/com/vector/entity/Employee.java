package com.vector.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMPLOYEE_INFO")
@NoArgsConstructor
@Data
public class Employee {

	@Id
	private Integer empno;

	private String ename;

	private Double sal;

	@Embedded
	private Address address;

}
