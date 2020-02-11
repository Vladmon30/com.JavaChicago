package day16_reviewsession1;

public class Operators {
	/*
	 * arifmetic operators: + , - , / , * , % shorthand assignment: +=, -=, /+, *=,
	 * %=. increment/decrement: --, ++. comparison: >, <, >=, <=, ==, !=.
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * distanceInMiles, pace (speed per hour) How many minutes it will take to reach
		 * destination
		 */
//	50 miles togo
//	5mph -> how many mintes its take.
//  Answer: 10 hours	

		double distanse = 34;
		double pace = 20;

		double minutes = distanse / pace * 60;
		System.out.println("Its gonna take " + minutes + " mintes.");

		// You spend 5min in traffic
		minutes += 5.0;

		// You spend 1 min extra coz u took wrong way
		minutes++;

		System.out.println("Finaly its take: " + minutes + " minutes");

		int number = 10;
		System.out.println(number / 3); // 3 because 10/3=9 in Java
		System.out.println(number % 3); // 1 because 10/3=9 + 1 is extra

		System.out.println(number); //10
		++number; // add 1
		System.out.println(number);  //11
		number++; // add 1
		System.out.println(number); //12
			//12=   12
		int num2 = number++;
		System.out.println(num2); //12
		System.out.println(number); //12+1=13
		     //  13     +   14+1  =28
		num2 = number++ + ++number; // 13  + 14+1 =28
		System.out.println(num2); //28
		System.out.println(number); //15
	}
}
