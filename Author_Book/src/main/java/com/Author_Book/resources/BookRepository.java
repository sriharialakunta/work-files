package com.Author_Book.resources;

import org.springframework.data.repository.CrudRepository;

import com.authorandbook.demo.Book;


public interface BookRepository extends CrudRepository<Book, Long>{

}
