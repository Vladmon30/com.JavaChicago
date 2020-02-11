package day37_wrapper_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		/*
		 * 1.Create List of integers 2.Ask 5 integer from user and store into int type
		 * using scanner 3.then add each number if it is even number
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter the number: " + (i + 1) + ": ");
			int number = scan.nextInt();

			if (number % 2 == 0) {
				nums.add(number);
			}
		}
		System.out.println(nums);
	}
}