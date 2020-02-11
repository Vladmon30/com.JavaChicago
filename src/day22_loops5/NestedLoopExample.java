package day22_loops5;

public class NestedLoopExample {
public static void main(String[] args) {
	
	/*
	 * loop inside the loop
	 * outer loop, inner loop
	 * 
	 */
	
	//write a program that prints numbers from 1 to 10 in same line
	//separated by space. For loop
	// add one more for loop and put everithing from 14-17. needs to loop 5 times
	

//	for(int i = 1; i <= 10; i++) {
	//	System.out.print(i+ " ");

	for(int j = 1; j<=10; j++) { // i =1, 2, 3, 
		for(int i = 1; i <= 10; i++) {// j=1,2,3,4,5,6,7,8,9,10
			System.out.print(i+ " ");
		}
	System.out.println();
	}
	System.out.println("Otside the loop");
	
	// modify nested loop above so that it print pattern:
	/*1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 123456
	 * 1234567
	 * 12345678
	 * 123456789
	 * 12345678910
	 * 
	 */
	for(int j = 1; j<=10; j++) { // j =1, 2, 3, 
		for(int i = 1; i <= j; i++) { //i=
			System.out.print(i+ " ");
		}
	System.out.println();
	}
	System.out.println("Otside the loop");
	
	/*
	 * 12345678910
	 * 123456789
	 * 12345678
	 * 1234567
	 * 123456
	 * 12345
	 * 1234
	 * 123
	 * 12
	 * 1
	 */
	
//	for(int outer = 10; outer >=1; outer--) { // j =1, 2, 3, 
//		for(int inner = 1; inner <= outer; inner++) { //i=
//			System.out.print(inner+ " ");
//		}
//	System.out.println();
//	}
	
	//homework:
	/* 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 123456
	 * 1234567
	 * 12345678
	 * 123456789
	 * 12345678910
	 * 12345678910
	 * 123456789
	 * 12345678
	 * 1234567
	 * 123456
	 * 12345
	 * 1234
	 * 123
	 * 12
	 * 1
	*/
	
}
}
