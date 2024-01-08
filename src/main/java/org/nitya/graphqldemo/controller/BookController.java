package org.nitya.graphqldemo.controller;


import org.nitya.graphqldemo.entity.Book;
import org.nitya.graphqldemo.repository.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BookController {
    private BookService bookService;
@Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //create


    public Book createBook(@RequestBody  Book  book){
        return this.bookService.createBook(book);

}



@QueryMapping("getAllBook")
    public List<Book> getAllBook(){
        return this.bookService.getAllBook();
    }



    //get book


    @QueryMapping("/getBook")
    public Book getBook(@Argument int bookId){
        return this.bookService.getBook(bookId);
    }

}
