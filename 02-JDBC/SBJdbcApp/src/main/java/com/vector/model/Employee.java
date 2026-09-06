package com.vector.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

	private int empno;
	private String ename;
	private double sal;
	private int deptno;

}
