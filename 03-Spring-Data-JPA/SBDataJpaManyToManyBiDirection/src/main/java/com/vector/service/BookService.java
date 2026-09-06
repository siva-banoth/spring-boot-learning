package com.vector.service;

import java.util.List;

import com.vector.entity.Author;
import com.vector.entity.Book;


public interface BookService {

	Book addAuthors(Book book, List<Author> authors);

	Book saveBook(Book book);

	Book loadBook(Long id);
	
	void removeBook(Long id);
}
