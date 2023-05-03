package com.Abstraction;

public class BooksReader {
	private String title;
	private String author;
	private int qty;

	public BooksReader() {
	}
	public BooksReader(String title, String author, int qty) {
		this.title = title;
		this.author = author;
		this.qty = qty;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public int getQty() {
		return this.qty;
	}
	
	public String toString() {
		return "Title: "+this.title+"\nAuthor: "+this.author+"\nQuantity: "+this.qty;
	}
}
