/**
 * 29-Oct-2019
 *
 * desinpattern
 *
 * com.regency.designpattern.creational.prototype
 *
 * BookShop.java
 *
 * @author : Pratyus
 */
package com.regency.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Pratyus
 *
 */
public class BookShop implements Cloneable {

	private String shopname;
	
	List<Book> books = new ArrayList<Book>();

	/**
	 * @return the shopname
	 */
	public String getShopname() {
		return shopname;
	}

	/**
	 * @param shopname the shopname to set
	 */
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}

	public void loadData() {
		
		for(int i=0; i<5; i++) {
			Book book = new Book();
			book.setId(i);
			book.setBookname("book"+i);
			getBooks().add(book);
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop bookShop = new BookShop();
		
		// TODO Auto-generated method stub
		for(Book book : this.getBooks()) {
			bookShop.getBooks().add(book);
		}
		
		return bookShop;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop slvBookShop = new BookShop();
		slvBookShop.setShopname("SLV Book Store");
		slvBookShop.loadData();
		System.out.println("SLV Book Store");
		System.out.println(slvBookShop);
		
		BookShop kalyanBookShop = slvBookShop.clone();
		kalyanBookShop.setShopname("Kalyan Book Store");
		System.out.println("Kalyan Book Store");
		System.out.println(kalyanBookShop);
		
		slvBookShop.getBooks().remove(2);
		System.out.println("After remove SLV Book Store");
		System.out.println(slvBookShop);
		
	}
}


class Book {
	private int id;
	private String bookname;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the bookname
	 */
	public String getBookname() {
		return bookname;
	}
	/**
	 * @param bookname the bookname to set
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + "]";
	}
	
}