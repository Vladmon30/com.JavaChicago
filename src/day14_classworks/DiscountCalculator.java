package day14_classworks;

import java.util.Scanner;

public class DiscountCalculator {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Price:");
	int price = scan.nextInt();
	
	System.out.println("Enter Quantity:");
	int quantity = scan.nextInt();
	
	
	System.out.println("Total: " + price * quantity);
	
	if (quantity >= 100 && quantity <=120) {
		
		System.out.println("Discount 10%");
		System.out.println("Your discount: $"+ ((price*quantity)*0.1));
		System.out.println("Price with discount: $"+ ((price*quantity)-((price*quantity)*0.1)));
		
	}else if (quantity > 120 ) {
		System.out.println("Discount 15%");
		System.out.println("Your with discount: $"+ ((price*quantity)*0.15));
		System.out.println("Price with discount: $"+ ((price*quantity)-((price*quantity)*0.15)));
		
	}else if (quantity < 100 ) {
			System.out.println("Discount 0%");
			System.out.println("Total Price without discount: $"+ (price*quantity));
			
		}
	}
}



		
		
		
		
	


