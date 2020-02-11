package day10_conditionals4;



/* If number is divisible by 3 (no remainder),
 * print "Fizz"
 * If number is divisible by 5 (no remainder),
 * print "Buzz"
 * If number is divisible by 3 and 5,
 * print "FizzBzz"
 * Else print number itself
 */

public class FizzBuzz {
public static void main(String[] args) {
	
	int number =46;
	if(number % 5== 0 && number % 3== 0 ) {
		System.out.println("FizzBuzz");
	}else if (number % 3== 0) {
		System.out.println("Fizz");
	}else if(number % 5== 0) {
		System.out.println("Buzz");
	}else {
		System.out.println("number");
	}
	
	
	
	
	
}
}
