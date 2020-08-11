package com.twop.librarymanagement.booksservice.services;

import java.util.*;
import com.twop.librarymanagement.booksservice.entities.Book;
import com.twop.librarymanagement.booksservice.repository.BookRepository;

public class BookService {
    private BookRepository repo = new BookRepository();

    public List<Book> getAllBooks() {
        return repo.booksStorage;
    }

    public Book getBookByID(int id) {
        Book selectedBook = null;

        for(Book book : repo.booksStorage) {
            if(book.getID() == id) {
                selectedBook = book;
            }
        }

        if(selectedBook == null) {
            throw new RuntimeException("you don't have a book!! :(");
        }

        return selectedBook;
    }
}
