package com.authorandbook.demo;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Author {


		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String Firstname;
		private String Lastname;
		
		@ManyToMany(mappedBy = "author")
		
		private Set<Book> books = new HashSet<>();
		
		public Author(){
			
		}
		
		
		public Author(String firstname, String lastname) {
			super();
			Firstname = firstname;
			Lastname = lastname;

		}
		

		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getFirstname() {
			return Firstname;
		}


		public void setFirstname(String firstname) {
			Firstname = firstname;
		}


		public String getLastname() {
			return Lastname;
		}


		public void setLastname(String lastname) {
			Lastname = lastname;
		}


		public Set<Book> getBooks() {
			return books;
		}
		

		@Override
		public String toString() {
			return "Author {id=" + id + ", "
								+ "Firstname=" + Firstname 
								+ ", Lastname=" + Lastname 
								+ ", books=" + books + "}";
		}


		@Override
		public int hashCode() {
			return Objects.hash(id);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Author other = (Author) obj;
			return id == other.id;
		}
		
		

}