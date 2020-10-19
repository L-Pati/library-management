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

    public void addBook(Book book) {
        Book newBook = new Book();

        newBook.setTitle(book.getTitle());
        newBook.setAuthor(book.getAuthor());
        bookRepository.save(newBook);
    }

    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    public String checkOutBook(long bookId) {
        Book book = bookRepository.findById(bookId).get();

        if(book.isAvailable()) {
            book.checkOutBook();
            bookRepository.save(book);
            System.out.println(book.isAvailable());
            return "Success!";
        } else {
            return "Failure :(";
        }
    }

    public void returnBook(long bookId) {
        Book book = bookRepository.findById(bookId).get();

        if(!book.isAvailable()) {
            book.returnBook();
        }
    }
}
