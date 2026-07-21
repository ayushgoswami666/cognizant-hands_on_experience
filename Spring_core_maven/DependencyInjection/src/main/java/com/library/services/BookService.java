package com.library.services;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void addbook() {
        System.out.println("Book is adding....");
        repository.savebook();
    }

}