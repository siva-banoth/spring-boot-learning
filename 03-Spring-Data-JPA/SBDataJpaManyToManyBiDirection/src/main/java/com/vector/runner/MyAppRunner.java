package com.vector.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.vector.entity.Author;
import com.vector.entity.Book;
import com.vector.service.BookService;

import jakarta.transaction.Transactional;

@Component
public class MyAppRunner implements ApplicationRunner {

	@Autowired
	BookService service;

	@Transactional
	@Override
	public void run(ApplicationArguments args) throws Exception {

		// saveBook();

		// loadBook(2L);
		
		// removeBook(1L);

	}
	
	// cascade should be removed
	private void removeBook(long l) {
		service.removeBook(l);
		
	}

	private void loadBook(long l) {

		Book book = service.loadBook(l);
		System.out.println("Name of the Book : " + book.getName());

	}

	private void saveBook() {

		Book book1 = new Book();
		book1.setName("Java");

		Book book2 = new Book();
		book2.setName("Spring");

		Author author1 = new Author();
		author1.setName("James");

		Author author2 = new Author();
		author2.setName("John");

		Author author3 = new Author();
		author3.setName("Jeffery");

		List<Author> authorsForBook1 = Arrays.asList(author1, author2);
		List<Author> authorsForBook2 = Arrays.asList(author2, author3);

		book1 = service.addAuthors(book1, authorsForBook1);
		book2 = service.addAuthors(book2, authorsForBook2);

		book1 = service.saveBook(book1);
		book2 = service.saveBook(book2);

		System.out.println("The books with authors are inserted into the Database");
		System.out.println("The id of book1 : " + book1.getId());
		System.out.println("The id of book2 : " + book2.getId());
	}

}
