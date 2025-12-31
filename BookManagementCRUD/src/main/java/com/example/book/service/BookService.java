package com.example.book.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.book.model.Book;
import com.example.book.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public Book save(Book book) { return repo.save(book); }

    public List<Book> getAll() { return repo.findAll(); }

    public Book update(Long id, Book book) {
        book.setId(id);
        return repo.save(book);
    }

    public void delete(Long id) { repo.deleteById(id); }
}
