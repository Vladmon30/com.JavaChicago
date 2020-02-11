package intervewQuestion;

import OOP4calc2.main;

public class Fibonachi {
	public static void main(String[] args) {
		int n = 10; // fib num
		int a = 0;
		int b = 0;
		int c = 1;

//	    Scanner s = new Scanner(System.in);
//	    System.out.print("Enter value of n:");
//	    n = s.nextInt();
		System.out.print("Fibonacci Series:");
		for (int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
			//0 1 1 2 3 5 8 13 21 34 
		}
	}
}