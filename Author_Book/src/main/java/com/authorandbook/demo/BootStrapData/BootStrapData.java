package com.authorandbook.demo.BootStrapData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.Author_Book.resources.AuthorRepository;
import com.Author_Book.resources.BookRepository;
import com.authorandbook.demo.Author;
import com.authorandbook.demo.Book;
@Component
public class BootStrapData implements CommandLineRunner {
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Author hari = new Author("Srihari","Alakunta");
		Book nbk = new Book("J2EE Development without EJB","3939459459", null);
		
        hari.getBooks().add(nbk);
        nbk.getAuthor().add(hari);

        authorRepository.save(hari);
        bookRepository.save(nbk);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459", null);
        rod.getBooks().add(noEJB);
        noEJB.getAuthor().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
		
		
		
		
		
	}

	
	
}
