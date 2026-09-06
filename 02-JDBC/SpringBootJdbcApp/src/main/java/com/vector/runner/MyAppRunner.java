package com.vector.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		jdbcTemplate.execute("DROP TABLE IF EXISTS STUDENT");
		jdbcTemplate
				.execute("CREATE TABLE STUDENT (SID INT, SNAME VARCHAR(20), SAGE INT, CGPA DOUBLE, PRIMARY KEY(SID) )");
		System.out.println("+++++++++ Table is Created ++++++++++++++");

		jdbcTemplate.update("INSERT INTO STUDENT VALUES(1102, 'MAX', 23, 9.1)");
		jdbcTemplate.update("INSERT INTO STUDENT VALUES(1134, 'JOHN', 22, 8.9)");
		jdbcTemplate.update("INSERT INTO STUDENT VALUES(1150, 'MILLER', 21, 7.5)");
		jdbcTemplate.update("INSERT INTO STUDENT VALUES(1191, 'JOHN', 24, 6.2)");
		System.out.println("+++++++++++ Values are Inserted +++++++++++++++");

	}

}
