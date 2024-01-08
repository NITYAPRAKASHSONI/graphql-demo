package org.nitya.graphqldemo.repository;

import org.nitya.graphqldemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
