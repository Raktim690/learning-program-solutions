package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listAllBooks() {
        System.out.println("BookService is listing books using the repository.");
        bookRepository.getAllBooks();
    }
}
