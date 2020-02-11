package day16_reviewsession1;

public class PrintAMessage {

	public static void main(String[] args) { // 'args' defoult name u can name it what ever want

		System.out.println("---WELCOME TO REWIEW SEESION---");
		System.out.println(12122); // can rint nmbers without doblequotes - "".
		System.out.println("Topic 1 is " + "Printing varios messages"); // + is adding or concatinating method.

		int balance = 100;
		System.out.println("Balance is " + balance);
		System.out.println("Balance is " + balance + 55);  // 100+55= 10055
		System.out.println("Balance is " + (balance + 55)); // (100+55)=155
		
		//print vs println
		 // print - will  print everything in same line
		
		System.out.print("Today is ");
		System.out.print("Java review");   
		System.out.print("day1");
		
		
		// println - will print everything in a new line.
		System.out.println();
	
		System.out.println("Today is ");
		System.out.println("Java review");   
		System.out.println("day1");
		
		
		// \n, \t,
		
		System.out.println("Next topic to review is \n datatypes"); // \n - print in next line
		
		System.out.println("Next topic to review is \\n datatypes"); // just print as is.
		
		System.out.println("Largest integer in Java is \"long\""); //  \ - print as is
		
		
		// print this - "I want to buy 'wooden spoon' from "etsy".
		System.out.println("I want to buy 'wooden spoon' from \"etsy\"");
		
		String msg = "I want to buy 'wooden spoon' from \"etsy\"";
		System.out.println(msg);
		
		
		
	}
}
