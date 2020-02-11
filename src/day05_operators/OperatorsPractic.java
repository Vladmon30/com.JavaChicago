package day05_operators;

public class OperatorsPractic {
	public static void main(String[] args) {
		int apples = 5;
		apples +=10;
		System.out.println("Apples are " + apples);
		
		int cars = 23;
		cars -=10;
		System.out.println("Cars in lot left: " + cars);
		
		double pizza = 12;
		pizza /= 5;
		System.out.println("It will be " + pizza + " slises pizza for each people");
		
		
		// find how many minutes in whole hours
		 int minutes =500;
		 int hours = minutes / 60;
		 System.out.println("Hours" + hours);
		 minutes  %=60;
		 System.out.println("Remaining Minutes: " + minutes);
		 
		 
		
	}
}
