package com.ryanh.example;

import com.ryanh.example.model.Book;
import com.ryanh.example.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

    static void main(String[] args) {
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
