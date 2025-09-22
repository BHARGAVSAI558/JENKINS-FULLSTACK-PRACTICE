package com.fsd.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fsd.backend.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findByName(String name);
    Book findByAuthor(String author);
}
