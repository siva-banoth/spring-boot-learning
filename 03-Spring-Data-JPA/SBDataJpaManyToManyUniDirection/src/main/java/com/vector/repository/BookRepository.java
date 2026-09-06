package com.vector.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vector.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
