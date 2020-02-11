package day18_loops1;

public class WhileLoop {
	public static void main(String[] args) {
		//as long as condition is true. Loop will keep running
		//below loop called an infinite loop. because b will not be false
		//boolean b = true;
		//while (b) {
		//	System.out.println("Hello World");
		
		int num = 0;
		
		while (num < 10) {
		System.out.println("In while loop");
		// num becomes is 1 because num=0 + +(1)
		num++;
		}
		/*create a variable counter and assign 1 to it
		 * keep printing the value of conter as long as
		 * counter is less than 15
		 */
		int counter = 1;
		while (num < 15) {
			System.out.println(counter);
			counter ++;
		}
	}
}
