package day18_loops1;

public class PrintEvens {
	public static void main(String[] args) {
		/*
		 * Using if condition within while loop: start variable number with 1 and loop
		 * until 100 check if number is even:] print the number
		 */

		int num = 1;
		while (num <= 100) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			++num;
		}
System.out.println("after while loop");
	}
}
