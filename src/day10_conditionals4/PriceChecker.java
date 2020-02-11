package day10_conditionals4;

public class PriceChecker {
public static void main(String[] args) {
	/*
	 * item -> 1 - 50 -> "Cheap"
	 * ->50 - 100 -> "Expensive"
	 * -> "Not Buying"
	 * 
	 */
	
	int price = 1555;
	String status;
	if(price >= 1 && price <=50) {
		status = "Cheap";
	}else {
		if(price >= 51 && price <= 100) {
			status = "Expensive";
		}else { 
			status = "Not Buying";
		}
	}
	
	System.out.println("Status with if: " + status);
	status = (price >= 1 && price <=50) ? "Cheap": 
		(price >= 51 && price <= 100) ?
				"Expensive" : "Not Buying" ;
	
	System.out.println("Status with? " + status);
}
}
