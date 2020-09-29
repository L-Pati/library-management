package com.twop.librarymanagement.booksservice.services;

import java.util.*;
import com.twop.librarymanagement.booksservice.entities.Book;
import com.twop.librarymanagement.booksservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    public BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> allBooks = new ArrayList<>();
        bookRepository.findAll().forEach(allBooks::add);
        return allBooks;
    }

    public Book getBookByID(int id) {
        Book selectedBook = null;

//        for(Book book : repo.booksStorage) {
//            if(book.getID() == id) {
//                selectedBook = book;
//            }
//        }
//
//        if(selectedBook == null) {
//            throw new RuntimeException("you don't have a book!! :(");
//        }

        return selectedBook;
    }

    public List<Book> getBookByQuery(String query) {
        List<Book> bookResult = new ArrayList<>();

//        for(Book book : repo.booksStorage) {
//            System.out.println(book.getTitle().contains(query));
//            System.out.println(book.getAuthor().contains(query));
//
//            if(book.getTitle().contains(query) || book.getAuthor().contains(query)) {
//                bookResult.add(book);
//            }
//        }

        return bookResult;
    }

    public String addBook(Book book) {
        bookRepository.save(book);
        return "Success!";
    }

    public String checkOutBook(int bookId) {

        return "Success!";
    }

    public String returnBook(int bookId) {

        return "Success!";
    }
}
