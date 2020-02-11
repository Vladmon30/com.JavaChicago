package day40_classes_objects;

import java.util.ArrayList;
import java.util.List;

public class BookReader {
	public static void main(String[] args) {

		/*
		 * Create 3 objects from Book and set values. Add all 3 books to List. Loop the
		 * list and print out authors for each book.-

		 */
		Book b1 = new Book();
		b1.title = "Unbeateb Mind";
		b1.author = "Mark Devine";
		b1.pages = 300;

		Book b2 = new Book();
		b1.title = "Zero to one";
		b1.author = "Blake Masters";
		b1.pages = 130;

		Book b3 = new Book();
		b1.title = "Grande candore";
		b1.author = "Sell or be Sold";
		b1.pages = 150;

		List<Book> myBooks = new ArrayList<>();
		myBooks.add(b1);
		myBooks.add(b2);
		myBooks.add(b3);

		System.out.println(myBooks);
	}

}
