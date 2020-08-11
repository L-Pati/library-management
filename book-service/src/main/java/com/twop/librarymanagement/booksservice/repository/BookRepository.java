package com.twop.librarymanagement.booksservice.repository;

import java.util.*;
import com.twop.librarymanagement.booksservice.entities.Book;

public class BookRepository {
    private List<Book> booksStorage;

    public BookRepository() {
        booksStorage = Arrays.asList(
                new Book("To Kill a Mockingbird", "Harper Lee", 1234),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 5678),
                new Book("The Color Purple", "Alice Walker", 91011),
                new Book("Becoming", "Michelle Obama", 121314),
                new Book("Murder on the Orient Express", "Agatha Christie", 999897),
                new Book("The Power of Now", "Eckhart Tole", 969504),
                new Book("Steve Jobs", "Walter Isaacson", 516171)
        );
    }
}
