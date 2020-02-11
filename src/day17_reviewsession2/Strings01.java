package day17_reviewsession2;

public class Strings01 {
	public static void main(String[] args) {
		// string is a ombination
		String greeting = "Hello World!";
		// print number of caracters
		System.out.println(greeting.length());
		
		int len = greeting.length();
		System.out.println("length " + len);
		// print the first character
		// charAt method
		System.out.println(greeting.charAt(0));
		
		char firstCh = greeting.charAt(0);
		System.out.println("firstCh " + firstCh);

		// print last character. try to use
		// len vriable. or dont use len variable.
		System.out.println(greeting.charAt(11));
		// StringIndexOutOfBoundsException
		// System.out.println(greeting.charAt(len));
		System.out.println(greeting.charAt(len - 1));
		
		greeting = greeting + " I hope everyone is well";
		
		char lastCh = greeting.charAt(greeting.length() - 1);
		System.out.println("last char " + lastCh);

	}
}
