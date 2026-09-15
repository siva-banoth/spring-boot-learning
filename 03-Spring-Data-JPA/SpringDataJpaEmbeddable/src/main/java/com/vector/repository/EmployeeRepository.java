package com.vector.repository;

import org.springframework.data.repository.CrudRepository;

import com.vector.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
