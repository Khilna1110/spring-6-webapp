package guru.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    // new branch created - 4-bootstrap-data
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Author eric=new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd=new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved=authorRepository.save(eric);
        Book dddSaved=bookRepository.save(ddd);

        Author rod=new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB=new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("545585526");

        Author rodSaved=authorRepository.save(rod);
        Book noEjbSaved=bookRepository.save(noEJB);

        ericSaved.getBooks().add(ddd);
        rodSaved.getBooks().add(noEJB);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);


        System.err.println("In Bootstrap");
        System.err.println("Author Count: "+authorRepository.count());
        System.err.println("Book Count: "+bookRepository.count());

        
    }

}
