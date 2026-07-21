package com.library.LibraryMangement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.services.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
                new ClassPathXmlApplicationContext("Applicationconfig.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        service. issuebook();
    }
}
