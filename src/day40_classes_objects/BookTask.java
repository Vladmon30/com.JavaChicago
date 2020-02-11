package day40_classes_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.InputMap;

public class BookTask {
	public static void main(String[] args) {

		/*
		 * 3. Create a program that asks from user to enter total books and asks title,
		 * author and pages. Then store each book to the list.
		 * Input: Please enter total books:- 2 
		 * Please enter title for book 1:
		 * -Leaders eat last
		 * Please enter author for book1:
		 * -Simon Sinek
		 * Please enter pages for book1:
		 * -300
		 * Please enter title for book 2:
		 * -Zero to one
		 * Please enter author for book 2:
		 * -Blake Masters
		 * Please enter pages for book 2:
		 * -140
		 * Note: Print size of list of books and it should print 2.
		 */
		
		List<Book> books = new ArrayList();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of books: ");
		
		int bookNum = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i <bookNum; i++) { 
			Book book = new Book(); 	
			System.out.println("Please enter author for book " + (i+1) + ": ");
			book.author = scan.nextLine();
			
			System.out.println("Please enter title for book " + (i+1) + ": ");
			book.title = scan.nextLine();
			
			System.out.println("Please enter pages for book " + (i+1) + ": ");
			book.pages = scan.nextInt();
			
			scan.nextLine();
			
			books.add(book);
		}
		System.out.println("Size: " + books.size());
		
		
		
		}	
	}	

