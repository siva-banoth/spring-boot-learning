package com.vector.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.vector.model.Employee;
import com.vector.service.EmployeeService;

@Component
@Order(2)
public class ServiceCaller implements ApplicationRunner {

	@Autowired
	EmployeeService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Employee e = new Employee(7065, "DAVID", 7000, 30);
		service.saveEmployee(e);
		System.out.println("+*+*".repeat(20));

		service.updateEmployee(7188, 6999.0);
		System.out.println("+*+*".repeat(20));

		service.deleteEmployee(7209);
		System.out.println("+*+*".repeat(20));

		service.selectById(7188);
		System.out.println("+*+*".repeat(20));

		service.selectAll();
		System.out.println("+*+*".repeat(20));


	}

}
