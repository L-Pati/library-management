package com.twop.librarymanagement.booksservice;

import com.twop.librarymanagement.booksservice.entities.Book;
import com.twop.librarymanagement.booksservice.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServiceApplication implements CommandLineRunner {
	@Autowired
	BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book bookOne = new Book();
		bookOne.setAuthor("Harper Lee");
		bookOne.setTitle("To Kill a Mockingbird");

		Book bookTwo = new Book();
		bookTwo.setAuthor("George Orwell");
		bookTwo.setTitle("1984");

		Book bookThree = new Book();
		bookThree.setTitle("Pride and Prejudice");
		bookThree.setAuthor("Jane Austen");

		bookService.addBook(bookOne);
		bookService.addBook(bookTwo);
		bookService.addBook(bookThree);
	}
}
