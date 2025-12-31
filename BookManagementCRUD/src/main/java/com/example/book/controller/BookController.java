package com.example.book.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.book.model.Book;
import com.example.book.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.save(book);
    }

    @GetMapping
    public List<Book> getBooks() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return service.update(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.delete(id);
    }
}
