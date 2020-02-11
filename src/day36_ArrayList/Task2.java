package day36_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		/*
		 * 2. Create a program that asks names from user using Scanner and keep adding
		 * each name to list. Then ask user if user wants to continue adding names and
		 * keep adding to the list. In the end print names.
		 * input: Please enter name 1: James Do you want to add more name? Yes/No
		 * Yes  Please enter name 2:JohnDo you want to add more names? Yes/NoNo
		 * Output: [James, John]
		 */
		
		
//		Ask user to enter name and store to the list of names until user
//		doesn't want to continue adding names. 
		boolean check = true;
		List<String> names = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while(check) {
			System.out.println("Please enter name: ");
			names.add(scan.nextLine());
			System.out.println("Do you want to continue adding name? Yes/No");
			String answer = scan.next();
			scan.nextLine();
			if(answer.equalsIgnoreCase("no")) {
				check = false;
			}
		}
		System.out.println(names);
	}

}
