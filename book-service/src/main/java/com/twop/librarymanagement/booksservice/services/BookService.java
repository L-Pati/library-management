package com.twop.librarymanagement.booksservice.services;

import java.util.*;
import com.twop.librarymanagement.booksservice.entities.Book;
import com.twop.librarymanagement.booksservice.entities.Books;
import com.twop.librarymanagement.booksservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    public BookRepository bookRepository;

    public Books getAllBooks() {
        Books books = new Books();
        bookRepository.findAll().forEach(books.books::add);

        return books;
    }

    public Book getBookByID(long id) {
        Book book = bookRepository.findById(id).get();
        return book;
    }

    public List<Book> getBookByQuery(String query) {
        List<Book> bookResult = new ArrayList<>();

        return bookResult;
    }

    public String addBook(Book book) {
        bookRepository.save(book);
        return "Success!";
    }

    public String checkOutBook(long bookId) {
        Book book = bookRepository.findById(bookId).get();

        if(book.isAvailable()) {
            book.checkOutBook();
            return "Success!";
        } else {
            return "Could not checkout book.";
        }
    }

    public String returnBook(long bookId) {
        Book book = bookRepository.findById(bookId).get();

        if(!book.isAvailable()) {
            book.returnBook();
            return "Success!";
        } else {
            return "Book is already returned";
        }
    }
}
