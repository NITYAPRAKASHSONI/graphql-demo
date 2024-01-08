package org.nitya.graphqldemo.repository.services;

import org.nitya.graphqldemo.entity.Book;

import java.util.List;

public interface BookService {

    //create book

    Book createBook(Book book);


    //get all
    List<Book> getAllBook();

    //getSingle Book

    Book getBook(int bookId);
}
