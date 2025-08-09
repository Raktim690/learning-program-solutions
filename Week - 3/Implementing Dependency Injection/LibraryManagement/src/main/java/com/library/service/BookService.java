package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Spring is injecting the BookRepository via setter.");
        this.bookRepository = bookRepository;
    }

    public void listAllBooks() {
        System.out.println("BookService is listing books using the repository.");
        bookRepository.getAllBooks();
    }
}