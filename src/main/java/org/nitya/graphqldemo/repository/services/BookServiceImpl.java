package org.nitya.graphqldemo.repository.services;

import org.nitya.graphqldemo.entity.Book;
import org.nitya.graphqldemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{


    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(Book book) {
      return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(int bookId) {
        return bookRepository.findById(bookId).orElseThrow(()->new RuntimeException("Book is not found with given bookId"));
    }
}
