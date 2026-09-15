package com.vector.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vector.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
