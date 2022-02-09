package com.example.purchase.application.business.event;
import java.util.List;

import com.example.purchase.domain.Book;

public class BookListByCategoryEvent extends BookEvent {
	private final List<Book> bookList;

	public BookListByCategoryEvent(List<Book> bookList) {
		this.bookList = bookList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

}