package com.twop.librarymanagement.booksservice.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookResource {
    @GetMapping("/greet")
    public String greet() {
        return "Hi!";
    }
}
