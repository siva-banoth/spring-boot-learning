package com.vector.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vector.model.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// INSERT OPERATION
	public void save(Employee e) {
		jdbcTemplate.update("INSERT INTO EMP VALUES (?, ?, ?, ? )", e.getEmpno(), e.getEname(), e.getSal(), e.getSal());
	}

	// SELECT OPERATION
	public void findById(int empno) {
		Map<String, Object> map = jdbcTemplate.queryForMap("SELECT * FROM EMP WHERE EMPNO = ?", empno);

		map.forEach((k, v) -> System.out.println(k + ":" + v));
	}

	// SELECT ALL OPERATION
	public void findAll() {
		List<Map<String, Object>> employees = jdbcTemplate.queryForList("SELECT * FROM EMP");

		// for each loop [for each map in employees list]
		for (Map<String, Object> map : employees) {
			map.forEach((k, v) -> System.out.println(k + ":" + v));
		}
	}

	// UPDATE OPERATION
	public void update(int empno, double sal) {
		jdbcTemplate.update("UPDATE EMP SET SAL=? WHERE EMPNO = ?", sal, empno);
	}

	// DELETE OPERATION
	public void deleteById(int empno) {
		jdbcTemplate.update("DELETE FROM EMP WHERE EMPNO = ?", empno );
	}


}
