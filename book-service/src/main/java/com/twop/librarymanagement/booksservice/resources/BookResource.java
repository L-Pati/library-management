package com.twop.librarymanagement.booksservice.resources;

import java.util.*;
import com.twop.librarymanagement.booksservice.entities.Book;
import com.twop.librarymanagement.booksservice.entities.Books;
import com.twop.librarymanagement.booksservice.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookResource {
    @Autowired
    private BookService bookService;

    @GetMapping("/greet")
    public String greet() {
        return "Hi!";
    }

    @GetMapping
    public Books getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookByID(@PathVariable("id") long id) {
        return bookService.getBookByID(id);
    }

    @GetMapping("/search/{query}")
    public List<Book> getBookByQuery(@PathVariable("query") String query) {
        return bookService.getBookByQuery(query);
    }

    @PostMapping
    public void createBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @DeleteMapping
    public void deleteBook(@RequestBody Book book) {
        bookService.deleteBook(book);
    }

    @PutMapping("/checkout/{bookId}")
    public String checkoutBook(@PathVariable("bookId") int bookId) {
        return bookService.checkOutBook(bookId);
    }

    @PutMapping("/return/{bookId}")
    public void returnBook(@PathVariable("bookId") int bookId) {
        bookService.returnBook(bookId);
    }
}