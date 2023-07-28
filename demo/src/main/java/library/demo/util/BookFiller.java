package library.demo.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import library.demo.model.Book;
import library.demo.service.BookService;

@Component
public class BookFiller { 

    @PostConstruct
    public void init()
    { 
         Book book1 = new Book(title: "La comunidad del anillo", 
              description: "Primer libro del senor de los anillos", author:"J.R Tolkien");
         bookService.addBook(book1);
         try {Thread.sleep(millis: 1000);} catch (InterruptedException e) {} 
         Book book2 = new Book(title: "Las dos torres",
              description: "Segundo libro del senor de los anillos", author:"J.R Tolkien");
         bookService.addBook(book2);
         try {Thread.sleep(millis: 1000);} catch (InterruptedException e) {}
         Book book3 = new Book(title: "El retorno del rey", 
              description: "Ultimo libro del senor de los anillos", author:"J.R Tolkien");
         bookService.addBook(book3);
    }
  }