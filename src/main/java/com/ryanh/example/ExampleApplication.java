/*
 * Copyright 2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.ryanh.example;

import com.ryanh.example.model.Book;
import com.ryanh.example.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner loadData(BookService bookService) {
        return args -> {
            bookService.addBook(new Book(1L, "Clean Code", "Robert C. Martin"));
            bookService.addBook(new Book(2L, "Effective Java", "Joshua Bloch"));
            bookService.addBook(new Book(3L, "Spring in Action", "Craig Walls"));
            bookService.addBook(new Book(4L, "The Pragmatic Programmer", "Andrew Hunt and David Thomas"));
            bookService.addBook(new Book(5L, "Design Patterns", "Erich Gamma et al."));
        };
    }
}
