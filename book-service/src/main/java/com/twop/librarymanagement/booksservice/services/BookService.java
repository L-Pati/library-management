package com.twop.librarymanagement.booksservice.services;

import java.util.*;
import com.twop.librarymanagement.booksservice.entities.Book;
import com.twop.librarymanagement.booksservice.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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

    public List<Book> getBookByQuery(String query) {
        List<Book> bookResult = new ArrayList<Book>();

        for(Book book : repo.booksStorage) {
            System.out.println(book.getTitle().contains(query));
            System.out.println(book.getAuthor().contains(query));

            if(book.getTitle().contains(query) || book.getAuthor().contains(query)) {
                bookResult.add(book);
            }
        }

        return bookResult;
    }
}
