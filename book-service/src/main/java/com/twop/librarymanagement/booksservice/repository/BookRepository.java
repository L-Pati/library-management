package com.twop.librarymanagement.booksservice.repository;

import com.twop.librarymanagement.booksservice.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
