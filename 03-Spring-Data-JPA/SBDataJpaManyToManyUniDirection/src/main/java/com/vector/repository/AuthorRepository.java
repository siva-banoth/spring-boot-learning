package com.vector.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vector.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
