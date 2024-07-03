package com.sathya.java8;

import java.util.ArrayList;

class Book
{
	 private Integer bookId;
	    private String bookName;
	    private Double bookPrice;
		public Book(Integer bookId, String bookName, Double bookPrice) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookPrice = bookPrice;
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
		}
				public Integer getBookId() {
			return bookId;
		}
		public void setBookId(Integer bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public Double getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(Double bookPrice) {
			this.bookPrice = bookPrice;
		}
}

public class A_15 {

	public static void main(String[] args) {
		ArrayList<Book>books=new ArrayList<Book>();
    	books.add(new Book(101,"wings",210.85));
    	books.add(new Book(104,"galaxy",510.85));
    	books.add(new Book(102,"comics",710.85));
    	books.add(new Book(103,"marvel",310.85));
    	
    	books.sort((s1,s2)->s1.getBookName().compareTo(s2.getBookName()));
    	books.forEach(book->System.out.println(book));
       
    	books.stream()
    	.filter(b->b.getBookPrice()>300)
    	.forEach(book->System.out.println(book));
	}

}

