package com.application.ilibrary.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Samson Effes
 */

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String edition;
    private UUID isbn = UUID.randomUUID();
    
    
	public Book(Long id, String title, String author, String edition, UUID isbn) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.isbn = isbn;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public UUID getIsbn() {
		return isbn;
	}
	public void setIsbn(UUID isbn) {
		this.isbn = isbn;
	}
    
    
}
