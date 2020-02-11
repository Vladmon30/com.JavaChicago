package day32_ReturnMethod;

import java.lang.reflect.Array;
import java.util.Random;

public class ExampleReturnMethod {
public static void main(String[] args) {
//	Array.
	
	//method parameter, arguments
	// we can declare as many parameters as we want in java custom method creation.
	//also we have option not to pass any parameters
	//a method which doesn't take any argument
	
	//int i = getRandomBtwZeroToHundres();
	
}

	private static Object getRandomBtwZeroToHundres() {
	// TODO Auto-generated method stub
	return null;
}


	/**
	 * This method return random number between 1 to 100
	 * 
	 * @return
	 */
	public static int getRandomBtwZerotoHundred() {
		Random random = new Random();
		return random.nextInt(100);
	}

	
	
	public static int getAge(String name) {
		if (name.equals("James")) {
			return 34;
		} else {
			return 55;
		}
	}
}
