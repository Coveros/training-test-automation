package com.coveros.training.automation.cucumber.books;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * A Library of books sorted by the date in which they were published
 * 
 * @author brian
 *
 */
public class Library {

	private SortedSet<Book> books;

	/**
	 * Add a book to the library
	 * 
	 * @param book
	 *            the book to add
	 */
	public void addBook(Book book) {
		if (this.books == null) {
			books = new TreeSet<>(new Comparator<Book>() {

				@Override
				public int compare(Book o1, Book o2) {
					return o1.getPublished() - o2.getPublished();
				}
			});
		}
		books.add(book);
	}

	/**
	 * Search the library for books published within a given date range. To
	 * search for all books published prior to a particular date, set the
	 * beginDate to 0. Likewise, search for all books published after a
	 * particular date, set the endDate to 0
	 * 
	 * @param beginYear
	 *            the beginning of the range
	 * @param endYear
	 *            the end of the range
	 * @return all books between the endDate and the beginDate, inclusive
	 * 
	 */
	public Collection<Book> searchByPublishDate(int beginYear, int endYear) {

		if (endYear == 0) {
			return books.tailSet(new Book("", "", beginYear));
		} else if (beginYear == 0) {
			return books.headSet(new Book("", "", endYear));
		} else {
			return books.subSet(new Book("", "", beginYear), new Book("", "", endYear));
		}
	}
}
