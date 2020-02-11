package day30_methods;

public class Calculator {
	public static void main(String[] args) {
		
		
		// add(34, 23); one more variant
		int d = add(43, 23);
		
		System.out.println("Jst to make sure: " + d);
		multiply(45, 23);

		// _______________________________________________________
	}

	private static void multiply(int i, int j) {
		return;
	}

	public static int add(int i, int j) {
		int sum = i + j;

		System.out.println("Sum is: " + sum);
		return sum;
	}
}
