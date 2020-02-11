package day22_loops5;

import java.util.Scanner;

public class WormUpTask_Register {
	public static void main(String[] args) {

		/*
		 * Create a program called Register. It will ask user how many items he
		 * purchased. Then based on that number it will ask item name and price that
		 * many times. You need to gather all items in one String variable items
		 * separated by comma And calculate sum of each item price into variable
		 * totalPrice. Then print out items and total price. Example: How many items are
		 * you purchasing? 2 What is item 1? Gloves How much is Gloves? 10.44 What is
		 * item 2? Hat How much is Hat? 13 --------- Your items: Gloves, Hat Your total
		 * Price: $23.44
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("How many items you purchase?: ");

		int itemsCount = input.nextInt();
		// declare variables for all items and price for them

		String allItems = "";
		double totalPrice = 0;

		for (int i = 1; i <= itemsCount; i++) { // tab - move forword
			System.out.println("What is item " + i + "?:"); // shift+tab -move back
			String item = input.next();

			System.out.println("How much is " + item + "?");

			double price = input.nextDouble();

			if (i == itemsCount) {
				allItems = allItems + item + ".";
			} else {
				allItems = allItems + item + ",";
			}
			totalPrice = totalPrice + price;
		}
		System.out.println("Your items: " + allItems);
		System.out.println("Total price: " + totalPrice + " ");
	}
}