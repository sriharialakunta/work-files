package com.authorandbook.demo;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class Book {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
					
	private Long id;
	private String titel;
	private String isbn;
	
	@ManyToMany
	@JoinTable(name = "author_book", 
				joinColumns = @JoinColumn(name = "book_id"), 
				inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author>Author = new HashSet<>();
	
	public Book() {
		
	}
	
	public Book(String titel, String isbn, Set<com.authorandbook.demo.Author> author) {
		super();
		this.titel = titel;
		this.isbn = isbn;
		Author = author;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}


	public void setTitel(String titel) {
		this.titel = titel;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Set<Author> getAuthor() {
		return Author;
	}


	public void setAuthor(Set<Author> author) {
		Author = author;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Book {id=" + id + ", titel=" + titel + ", isbn=" + isbn + ", Author=" + Author + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}
	
}