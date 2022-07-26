package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {

	public Book(int id, String bookname, String authorName) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.authorName = authorName;
	}
	@Id
	private int id;
	private String bookname;
	private String authorName;
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	}

