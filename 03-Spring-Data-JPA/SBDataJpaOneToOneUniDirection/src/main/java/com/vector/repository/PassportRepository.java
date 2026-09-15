package com.vector.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vector.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, String>{

}
