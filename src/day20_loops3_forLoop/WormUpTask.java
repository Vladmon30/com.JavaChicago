package day20_loops3_forLoop;

import java.util.Scanner;

public class WormUpTask {
	public static void main(String[] args) {

		/*
		 * 1. Ask user to enter 2 numbers for variables start and end: if start is less
		 * than end: loop from start position to end position and print "Step " +
		 * number. If start is more than end: loop backwards from end to start and print
		 * "Step "+ number. Ex: Enter 2 numbers: 5 10 Step 5 Step 6 .....
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");

		int start = input.nextInt();
		int end = input.nextInt();

		if (start < end) {
			System.out.println("Looping forward");
			while (start <= end) {
				System.out.println("Step" + start);
				start++;
			}
		} else if(start > end) {
			System.out.println("Looping backward");
			while (start >= end) {
				System.out.println("Step" + start);
				start--;
			}
		}else {
			System.out.println("Numbers are equil");
			System.out.println("Step" + start);
		}
	}
}

