/*
 * Copyright 2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.ryanh.example.service;

import static org.junit.jupiter.api.Assertions.*;

import com.ryanh.example.model.Book;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookServiceTest {

    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookService = new BookService();

        bookService.addBook(new Book(1L, "Clean Code", "Robert C. Martin"));
        bookService.addBook(new Book(2L, "Effective Java", "Joshua Bloch"));
        bookService.addBook(new Book(3L, "Spring in Action", "Craig Walls"));
        bookService.addBook(new Book(4L, "The Pragmatic Programmer", "Andrew Hunt and David Thomas"));
        bookService.addBook(new Book(5L, "Design Patterns", "Erich Gamma et al."));
    }

    @Test
    void shouldReturnAllBooks() {
        List<Book> books = bookService.findAll();
        assertEquals(5, books.size());
    }
}
