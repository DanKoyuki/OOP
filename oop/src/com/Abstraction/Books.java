package com.Abstraction;

public class Books {
	public static void main(String[] args) {
		BooksReader A = new BooksReader("Animal Farm", "George", 5);
		Member Dan = new Member("Dan");

		System.out.println(A.toString());

		Dan.bbook("Animal Farm", A);

		System.out.println(A.toString());
	}

}
