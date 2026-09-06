package com.vector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.model.Employee;
import com.vector.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public void saveEmployee(Employee e) {
		repository.save(e);
		System.out.println("Employee is saved successfully");
	}

	public void updateEmployee(int empno, double sal) {
		repository.update(empno, sal);
		System.out.println("Employee is updated successfully");
	}

	public void deleteEmployee(int empno) {
		repository.deleteById(empno);
		System.out.println("Employee is deleted successfully");
	}

	public void selectById(int empno) {
		repository.findById(empno);
	}

	public void selectAll() {
		repository.findAll();
	}

}
