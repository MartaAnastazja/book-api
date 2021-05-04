package org.example.app.book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Optional<Book> get(Long id);

    List<Book> getBooks();

    void add(Book book);

    void delete(Long id);

    void update(Book book);
}