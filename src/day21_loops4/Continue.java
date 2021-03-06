package day21_loops4;

public class Continue {
	public static void main(String[] args) {

		// brake - will terminate or exit the loop
		// continue - will skip this iteration and continue to the next one

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i > 2) {
				break;
			}
		}
		for (int k = 0; k <= 10; k++) {
			if (k == 1 || k == 2) {
				continue;
			}
			System.out.println("Value of k " + k);
		}

		/*
		 * loop through numbers from 1 - 50 print each number in same line, separatly by spase; 
		 * if a number is divisible by 5 then skip it 
		 * if a number is divisible by
		 * 20 then exit the loop
		 */

		for (int num = 1; num <= 50; num++) {
			if (num % 5 == 0) {
				continue;
		}

			if (num % 20 == 0) {
				break;
			}
			System.out.print(num + " ");

		}
	}
}