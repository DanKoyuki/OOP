package com.Interface;

public class Driver {

	public static void main(String[] args) {
		Book A = new Book("The Little Prince", 1145);
		Library C = new Library();

		C.checkin(A);
		C.addBook(A);
		C.checkin(A);
	}

}
