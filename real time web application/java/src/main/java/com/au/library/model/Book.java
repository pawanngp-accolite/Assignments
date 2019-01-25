package com.au.library.model;

public class Book {
    private String id;
	private String bookName;
	 private String authorName;
	 private String Description;
	 private double Price;
	 public Book() {}
	 
	public Book(String id, String bookName, String authorName, String Description, double Price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.Description = Description;
		this.Price = Price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double Price) {
		this.Price = Price;
	}
	 
	
}
