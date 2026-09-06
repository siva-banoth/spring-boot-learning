package com.vector.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vector.model.Student;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(Student std) {
		jdbcTemplate.update("INSERT INTO STUDENT VALUES(?, ?, ?, ?)", std.getSid(), std.getSname(), std.getSage(),
				std.getCgpa());
	}

	public void delete(int sid) {
		jdbcTemplate.update("DELETE FROM STUDENT WHERE SID = ?", sid);
	}

	public void update(int sid, double cgpa) {
		jdbcTemplate.update("UPDATE STUDENT SET CGPA = ? WHERE SID = ?", cgpa, sid);
	}

	public void findById(int sid) {
		Map<String, Object> map = jdbcTemplate.queryForMap("SELECT * FROM STUDENT WHERE SID = ?", sid);
		map.forEach((k, v) -> System.out.println(k + ":" + v));
	}

	public void findAll() {
		List<Map<String,Object>> students = jdbcTemplate.queryForList("SELECT * FROM STUDENT ");
		
		for(Map<String, Object> map : students) {
			map.forEach((k,v) -> System.out.println(k +":"+v));
		}
	}

}
