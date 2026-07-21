package com.library.services;

import com.library.repository.BookRepository;

public class BookService {

    
    private BookRepository constructorrepo;
    private BookRepository setterrepo;
    
    //constructor injection
    public BookService(BookRepository constructorrepo) {
    	this.constructorrepo = constructorrepo;
    }
    //setter injection
    public void setSetterrepo(BookRepository setterrepo) {
        this.setterrepo = setterrepo;
    }

    public void issuebook() {
        System.out.println("Bookservice bean is Invoked");
        
        System.out.println("Setter Injection Invoked");
        setterrepo.displaybook();
        
        System.out.println("Constructor Injection Invoked");
        constructorrepo.displaybook();
    }

}