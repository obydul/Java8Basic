package com.obydul.lambda.store;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public List<Book> getBookSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));

//				new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new BookService().getBookSort());
	}
}

//class MyComparator implements Comparator<Book> {
//	@Override
//	public int compare(Book o1, Book o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//
//}
