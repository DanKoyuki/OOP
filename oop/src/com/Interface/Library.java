package com.Interface;

import java.util.ArrayList;

public class Library implements Settings {
	private ArrayList<Book> books;

	public Library() {
		this.books = new ArrayList<>();
	}

	@Override
	public void addBook(Book book) {
		if (books.contains(book)) {
			System.out.println("Book is already in library");
		} else {
			books.add(book);
		}
	}

	@Override
	public void checkin(Book book) {
		if (books.contains(book)) {
			System.out.println("Book Avilable!\nTitle: " + book.getTitle() + "\nID: " + book.getID());
		} else {
			System.out.println("Book unavailable");
		}
	}
}
