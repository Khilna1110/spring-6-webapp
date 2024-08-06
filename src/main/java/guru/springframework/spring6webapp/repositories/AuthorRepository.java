package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    // new branch created - 3-jpa-repositories
}
