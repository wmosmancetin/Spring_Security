package com.example.spring.Spring.Security.service;

import com.example.spring.Spring.Security.entity.Book;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

public interface IBooksService {

    @Secured({"ROLE_ADMIN"})
    List<Book> getAllBooks();

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    Book getBookByTitle(String title);

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    Book getBookById(Long id);


    @Secured({"ROLE_ADMIN"})
    void addBook(Book book);

    @Secured({"ROLE_ADMIN"})
    void updateBook(Book book);
}
