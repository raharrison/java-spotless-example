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

import com.ryanh.example.model.Book;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final Set<Book> books = new HashSet<>();

    public List<Book> findAll() {
        return new ArrayList<>(books);
    }

    public Optional<Book> findById(Long id) {
        return books.stream().filter(book -> book.id().equals(id)).findFirst();
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    public boolean updateBook(Book updatedBook) {
        if (deleteBook(updatedBook.id())) {
            books.add(updatedBook);
            return true;
        }
        return false;
    }

    public boolean deleteBook(Long id) {
        return books.removeIf(book -> book.id().equals(id));
    }
}
