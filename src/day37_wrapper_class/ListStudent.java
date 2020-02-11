package day37_wrapper_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListStudent {
	public static void main(String[] args) throws FileNotFoundException {

		/*__________________________________________________________________________________
		 * 
		 * 1.Write a program that reads values(student names) from test.txt file and
		 * stores each student name into list. Then print the size.Notice: test.txt file
		 * has empty lines which needs to be ignored when adding to list.
		 * __________________________________________________________________________________
		 * 
		 * 2. Create a method that accepts List of String(student names)and prints out
		 * in the following format. Ele1 - ele2 - ele3 - ele4 - ele5
		 * 							Ele6 - ele7 -
		 * ...Notice: One line should only consist of 5 elements.
		 * Output Sample:
		 * Murat - Adina - Kutmanai - Kamil - Daule - 
		 * Sarinzhi - Sofia -UranVlad - Yana - Guliza - 
		 * Ruslan - AlexEldar - Ermek - Bermet - Sandra -
		 * Muhammed - Baktygul - Hanife - Zhynara - Nurlan - 
		 * Vlad - Ermek - Sergey - Jazgul - Nargiza - 
		 * Aitolkun - Nariste - Sabyrbek - Tilek - Aslan - 
		 * VidatAigul - Aigerim - Talgat - Zhazgul - Aigul 
		 * ___________________________________________________________________________________
		 * 
		 * 3.  Create a method that takes List of String(Students) 
		 * and integer(length) and print out student name with given length
		 * ___________________________________________________________________________________
		 * 
		 * 4. Create a method that takes List of String(Students) 
		 * and print out student names from shortest length to longest length.
		 * Notice: Assume that shortest length is 3 letters and longest is 15 letters.
		 * ___________________________________________________________________________________
		 * 
		 */

		File file = new File("test.txt");

	List<String> studentNames = new ArrayList<>(); // create arrayList

		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String name = sc.nextLine().trim();

			//System.out.println(name);

			if(name.isEmpty()) {
				continue;
			}
			studentNames.add(name);
		}
//		System.out.println(studentNames);
		System.out.println(studentNames.size());
		printStudents(studentNames);
		System.out.println("\n----\n");
		printWithLength(studentNames, 5);
		printWithLength(studentNames, 7);
		System.out.println("\n----\n");
		printFromShortToLongest(studentNames);

	}
	
	public static void printWithLength(List<String> students, int length) {
		int count = 0;
		for(String name: students) {
//			condition to check name length to given length
			if(name.length() == length) {
				System.out.println(name);
				count++;
			}
		}
//		System.out.println("Total size of names with " + length+ " length: " + count);
	}
	
	public static void printFromShortToLongest(List<String> students) {
		for(int i = 3; i < 16; i++) {		
			printWithLength(students, i);                							  //print names from short to longest
		}
	}
	
	public static void printStudents(List<String> students) {
//		Iterate through the list
		int num = 4;
		for(int i = 0; i < students.size(); i++) {
			if(i == num) {
				System.out.print(students.get(i));
				System.out.println();
				num+=5;
			}
			else {
				System.out.print(students.get(i) + " - ");
			}
			
		}
//		keep printing in one line with dash separated
//		apply condition to check is already printed 5 student names
//		when we hit condition we start new line
		
	}
}