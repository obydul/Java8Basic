package com.obydul.lambda.store;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(661, "Kubernate", 888));
		books.add(new Book(201, "Hibernate", 456));
		books.add(new Book(301, "Spring", 350));
		books.add(new Book(401, "WebService", 540));
		return books;
	}

}
