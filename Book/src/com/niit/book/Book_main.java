package com.niit.book;

public class Book_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book();
		
		book.setId("BO1");
		book.setName("MY_BOOK");
		book.setAuthor("Chetan Bhagat");
		book.setPrice(500);
		book.setPublisher("MK");
		
		System.out.println( book.getId());
		System.out.println( book.getName());
		System.out.println( book.getAuthor());
		System.out.println( book.getPrice());
		System.out.println( book.getPublisher());
		
	}

}
