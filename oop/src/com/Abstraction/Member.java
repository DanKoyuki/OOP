package com.Abstraction;

import java.util.ArrayList;
import java.util.List;

public class Member extends SysLib{
	private String name;
	private String memberID;
	private List<String> Books;

	public Member(String name) {
		this.name = name;
		Books = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public String getID() {
		return this.memberID;
	}

	public void setID(String memberID) {
		this.memberID = memberID;
	}

	public void setBooks(List<String> Books) {
		this.Books = Books;
	}

	public List<String> getBooks() {
		return this.Books;
	}

	@Override
	public void bbook(String title, BooksReader book) {
		if (title.equals(book.getTitle())) {
			this.Books.add(title);
			book.setQty(book.getQty()-1);
		}
	}

	@Override
	public String findBook(String title, BooksReader book) {
		if (title.equals(book.getTitle())) {
			String output = "Book Found\nTitle: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nQuantity: " + book.getQty();
			return output;
		}

		else {
			return "Book Not Found";
		}
	}	
}