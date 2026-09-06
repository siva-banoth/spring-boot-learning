package com.vector.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {

	@Autowired
	SimpleJdbcCall jdbcCall;

	public void getBonus(int empid) {
		// specify the function name of the database
		jdbcCall.withFunctionName("return_bonus");

		Map<String, Object> output = jdbcCall.execute(empid);

		output.forEach((k, v) -> System.out.println((k + ":" + v)));
	}
}
