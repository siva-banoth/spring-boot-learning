package com.vector.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository(value="dbRepository")
public class DatabaseRepository {

	@Value("${driver.name}")
	private String driverClassName;

	@Value("${database.port}")
	private String port;

	@Value("${database.username}")
	private String username;

	@Value("${database.password}")
	private String password;

	public void showDatabaseProperties() {
		System.out.println("Driver classname : " + driverClassName);
		System.out.println("Database port : " + port);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
