package day16_reviewsession1;

import javax.sound.sampled.AudioFileFormat.Type;

public class PrimitivesReview {
	public static void main(String[] args) {

		/*
		 * Data TYPES in JAVA:
		 * 1)primitives;
		 * 2)objects/class types/non-primitives;
		 * 
		 * Primitives:
		 * 
		 * Wholenumbers/Integer;
		 *    byte > short > int > long;
		 * Floating point numbers/Numbers with Decimals:
		 * 	  float > double
		 * Caracter type:
		 * 	  char
		 * Boolean:
		 * 	  true/false
		 */
		
		byte chairs = 70;
		// byte secondRoomChairs = chairs - 20; // cant work with byte
		byte secondRoomChairs = 50;
		// first room has ___ chairs and second room has ___ chairs__
		//There are ___ chairs more in first room.
		System.out.println("First room has "+chairs+" chairs and second room has "+
		secondRoomChairs + " chairs.\n" +
				"There are " + (chairs - secondRoomChairs)+ " more in first room");
		
		short shortValue = 32000;
		System.out.println("Short value is: " + shortValue);
		
		int intValue = shortValue; // small can fit into large type. Implicit/Automatic casting
		System.out.println(intValue);
		
		intValue = intValue * 100; //3200000
		
		shortValue = (short)intValue; // explicit casting/converting.
		System.out.println("Short after casting: " + shortValue);
		
		int cityPopulation = 200_000_000; // we can put "_" underscore for easier reading.	
										  // compiler will ignore those
										  // your number can not start from underscore
		
		System.out.println(cityPopulation);
		
		long worldPopulation = 8_000_000_000L;
		System.out.println("Current world population is: " + worldPopulation);
		
		/*
		 *short shortNum = 500;
		 *byte byteNum = (byte)shortNum;
		 *System.out.println(byteNum);
		 * 
		 */
		
		 short shortNum = 500;
		 byte byteNum = (byte)shortNum;
		 System.out.println(byteNum);
		 
		 double price = 45.33, discount = 12.5;
		 double total = price = discount;
		 System.out.println(price);
		 System.out.println(discount);
		 System.out.println(total);
	}
}
