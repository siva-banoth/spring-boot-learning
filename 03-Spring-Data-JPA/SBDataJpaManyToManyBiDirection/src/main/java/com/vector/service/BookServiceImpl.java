package com.vector.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.entity.Author;
import com.vector.entity.Book;
import com.vector.repository.BookRepository;

@Service("booKservice")
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepo;

	@Override
	public Book addAuthors(Book book, List<Author> authors) {
		book.setAuthors(authors);
		return book;
	}

	@Override
	public Book saveBook(Book book) {
		book = bookRepo.save(book);
		return book;
	}

	@Override
	public Book loadBook(Long id) {
		Optional<Book> optional = bookRepo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void removeBook(Long id) {
		bookRepo.deleteById(id);
	}

}
