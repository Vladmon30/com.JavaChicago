package day25_arrays;

public class SumOfArray {
	public static void main(String[] args) {

		/*
		 * create avariable nums - assign value using a loop calculate the sum and print
		 * it additional steps: -calculate sum of even numbers -calculate sum of odd
		 * numbers
		 *
		 */

		int[] nums = { 10, 25, 43, 64, 56 };
		int sum = 0;
		int sumOfEvens = 0;
		int sumOfOdds = 0;

		for(int n : nums) {
			sum = sum + n;
			//sum+=n;
			
			if(n % 2 == 0) {
				sumOfEvens += n;
			}else {
				sumOfOdds += n;
				
			}
		}
			System.out.println("Sum is :" + sum);
			System.out.println("Sum of even is :" + sumOfEvens);
			System.out.println("Sum of odds is :" + sumOfOdds);
	}
	
	
	
	
}