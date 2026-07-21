package com.example.Exersice9.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Exersice9.entit.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	

}