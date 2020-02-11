package day18_loops1;

public class WarmUpTask2 {
	public static void main(String[] args) {

		// Contains method:
		// -Create a String variable garage and
		// Assign following string:
		// "Toyota, Nissan, Honda, BMW, Mazerati, Ford"
		// -convert whole garage into lowercase letters
		// -if garage isEmpty print "no cars in garage"
		// -using contains method check:
//
		// -if garage contains "toyota" or "nissan"
		// print "There is a Japanese car in garage"
		// if not print "No Japanese cars"
		// -if garage has "bmw"
		// print "there is a german car in garage"
		// if not print "no german cars"
		// -if garage has "Mazerati"
		// print "there is an italian car in garage"
		// if not print "no italian cars"
		// - if garage has "jaguar"
		// print "there is an british car in garage"
		// if not print "no british cars"

		String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford"; // if "" it empty than its print "no cars in
																		// garage"
		// convert whole garage into lower case letter;
		garage = garage.toLowerCase();
		System.out.println(garage);

		// -if garage isEmpty print "no cars in garage"

		if (garage.isEmpty()) {
			System.out.println("no cars in garage");
		}
		// How to find one string within another string
		// 1. contain.method
		// 2. indexOf >-1
		if (garage.contains("toyota") || garage.contains("nissan")) {
			System.out.println("There is a Japanese car in garage");
		} else {
			System.out.println("No Japanese cars");
		}
		if (garage.indexOf("BMW") > -1) {
			System.out.println("There is a german car in garage");
		} else {
			System.out.println("No german cars");

			if (garage.contains("jaguar")) {
				System.out.println("There is a british car in garage");
			} else {
				System.out.println("No british cars");

				String str = "Java is fun";
				System.out.println(str.indexOf("is")); // 5
				// whenever indexOf finds the string , it gives a 0 or a positive index number
				System.out.println("this"); // -1 no its mean no text inside str!!!!
				// whenever indexOf cannot finds the string , it gives a 0 or a positive index
				// number
			}
		}
	}
}