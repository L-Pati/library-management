package com.twop.librarymanagement.booksservice.services;

import java.util.*;
import com.twop.librarymanagement.booksservice.entities.Book;
import com.twop.librarymanagement.booksservice.repository.BookRepository;

public class BookService {
    private BookRepository repo = new BookRepository();

    public List<Book> getAllBooks() {
        return repo.booksStorage;
    }
}
