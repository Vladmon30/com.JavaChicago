package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		/*
		 * 
		 * 1.Create a program that asks 5 names from user using Scanner and keep adding
		 * each name to List of String collection. And print out list of names in the
		 * end.
		 * input:  Please enter name 1:James Please enter name 2:John———————-—
		 * output: [James, John, ...]
		 */
		
		// Ask from user names 5 times and store them into list
		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			System.out.println("Please enter name " + (i+1) + ": ");
			names.add(scan.nextLine());
		}
		System.out.println(names);
		names.remove("James");   // remove James from array
		System.out.println(names);
		
	}

}

