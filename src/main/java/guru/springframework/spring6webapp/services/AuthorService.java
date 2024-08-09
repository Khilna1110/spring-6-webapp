package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    // new branch created - 11-add-authors-assn
    Iterable<Author> findAll();

}
