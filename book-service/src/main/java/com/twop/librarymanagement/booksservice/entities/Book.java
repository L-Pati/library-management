package com.twop.librarymanagement.booksservice.entities;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Book {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
    private Boolean available = true;
    private LocalDate returnDate;
    private LocalDate checkOutDate;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getID() {
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
