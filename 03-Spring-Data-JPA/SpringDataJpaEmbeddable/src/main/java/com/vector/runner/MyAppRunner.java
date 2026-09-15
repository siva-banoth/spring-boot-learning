package com.vector.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Address;
import com.vector.entity.Employee;
import com.vector.repository.EmployeeRepository;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	EmployeeRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		saveEmployee();
		// loadEmployee();
		// updateEmployee();
		// removeEmployee();

	}

	private void saveEmployee() {

		// Creating Address Object
		Address address = new Address("3-110", "Ameerpet", "Hyderabad", 500016);

		// Creating Employee Object
		Employee emp = new Employee();
		emp.setEmpno(7788);
		emp.setEname("SCOTT");
		emp.setSal(6000.);
		emp.setAddress(address);

		repository.save(emp);

		System.out.println("Employee is inserted into the Database");
	}
}
