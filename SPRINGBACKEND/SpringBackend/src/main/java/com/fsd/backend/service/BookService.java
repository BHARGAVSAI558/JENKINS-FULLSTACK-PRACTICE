package com.fsd.backend.service;

import java.util.List;
import com.fsd.backend.entity.Book;

public interface BookService {
    Book addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(int id);
    Book updateBook(Book book);
    void deleteBookById(int id);
}
