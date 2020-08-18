package com.twop.librarymanagement.booksservice.resources;

import java.util.*;
import com.twop.librarymanagement.booksservice.entities.Book;
import com.twop.librarymanagement.booksservice.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookResource {
    private BookService bookService = new BookService();

    @GetMapping("/greet")
    public String greet() {
        return "Hi!";
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookByID(@PathVariable("id") int id) {
        return bookService.getBookByID(id);
    }

    @GetMapping("/search/{query}")
    public List<Book> getBookByQuery(@PathVariable("query") String query) {
        return bookService.getBookByQuery(query);
    }
}
