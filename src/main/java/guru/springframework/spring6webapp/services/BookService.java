package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;

public interface BookService {

    // new branch created - 8-add-book-service
    Iterable<Book> findAll();

}
