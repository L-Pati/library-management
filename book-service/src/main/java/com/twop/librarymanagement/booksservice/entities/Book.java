package com.twop.librarymanagement.booksservice.entities;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int id;
    private Boolean available = true;
    private LocalDate returnDate;
    private LocalDate checkOutDate;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getID() {
        return this.id;
    }

    public void checkOutBook() {
        this.available = false;
        this.checkOutDate = LocalDate.now();
        this.returnDate = LocalDate.now().plusDays(15);
    }

    public void returnBook() {
        this.checkOutDate = null;
        this.returnDate = null;
        this.available =  true;
    }
}
