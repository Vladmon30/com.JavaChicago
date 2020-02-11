package day06_operators_boolean;

public class BooleanOperators {
	public static void main(String[] args) {
		boolean isExpensive = true;
		System.out.println(isExpensive);
		boolean isEnough = false;
		System.out.println("Is it enough - " + isEnough);
		
		
		System.out.println(10>5); // true
		System.out.println(100<99);//false
		
		int count = 55;
		System.out.println(count > 10 );
		
		
		int currentNumber = 55;// 55--> true 555--> false
		System.out.println(count == currentNumber);
		
		int speedLimit = 55;
		int currentSpeed = 60;
		System.out.println(currentSpeed > speedLimit);
		System.out.println(currentSpeed < speedLimit);
		System.out.println(currentSpeed == speedLimit);
		
	}
	
}
