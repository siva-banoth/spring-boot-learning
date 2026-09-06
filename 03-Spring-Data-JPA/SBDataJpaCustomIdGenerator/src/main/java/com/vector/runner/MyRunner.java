package com.vector.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Customer;
import com.vector.repository.CustomerRepository;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	CustomerRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Customer c1 = new Customer();
		c1.setName("JOHN");
		c1.setPhoneNumber(9009001L);

		Customer c2 = new Customer();
		c2.setName("Allen");
		c2.setPhoneNumber(8008001L);

		c1 = repository.save(c1);
		System.out.println("The id of customer name : John is : " + c1.getId());

		c2 = repository.save(c2);
		System.out.println("The id of customer name : Allen is : " + c2.getId());

	}

}
