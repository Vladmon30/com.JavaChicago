package day24_arraysintro;


public class WormUpTask {
	public static void main(String[] args) {

		/*
		 * Please write a program to print multiplication table using nested loops.
		 * Version 1 - we will go over this one during the class: Print the table like
		 * in image below and you can print in single column, not in 5 columns. make
		 * sure there are borders like in the image: Ex: 1*1=1 2*1=2 1*2=2 2*2=4 1*3=3
		 * 2*3=6
		 * 
		 */
		for (int outer = 1; outer <= 10; outer++) {
			System.out.println("\t" + outer);
			System.out.println("-----------------");
			for (int inner = 1; inner <= 10; inner++) {
				int result = outer*inner;
				
				System.out.println("| "+ outer + " X " + inner + " = " + result + "\t|");

			}
			System.out.println("-----------------");
		}
	}
}
