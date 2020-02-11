package day07_conditionals;

public class IfElseStatement {
	
	public static void main(String[] args) {
		
		double coffeePrice = 8.50;
		
		if(coffeePrice < 6.0) {
			System.out.println("I'll get coffee");
		}else { 
			System.out.println("I'll not get coffee. Too expencive!");

			}
		double acoountBalance = 450.50;
		double price = 700;
		
	// if u have enough money u buy the item 
	// else u say not enough balance
		
		if(acoountBalance >= price) {
			System.out.println("Lets buy item");
			System.out.println("I am ordering online");
			
		}else {
			System.out.println("Not enough balance, not buying");
			System.out.println("Lets wait for paycheck");
		}
		
		/*2 variables: speedLimit, currentSpeed
		 * if currentSpeed  is more than 20 mph compare to speedLimit
		 * then u get a speeding ticket,
		 * otherwise keep driving
		 */
		 int speedLimit, currentSpeed;
		 speedLimit = 55;
		 currentSpeed = 65;
		
		if(currentSpeed >= speedLimit + 20) {
			System.out.println("Hey slow down");
			System.out.println("You are going to get ticket");
		}else {
			System.out.println("Good job");
			System.out.println("Keep driving");
		}
		
		/* create a boolean variable isPrime
		 * if isPrime is true than shipping is 0.0
		 * if not then shipping is 7.99
		 * print shipping cost
		 */
				boolean isPrime =true;
				double shipping;
				double cost = 20.0;
				if(isPrime == true) {
					shipping = 0.00;
				}else {
					shipping = 7.99;
				}
				System.out.println(cost+shipping);
		//double isPrime;
		//isPrime = 0.0;
		
		//if (isPrime)
		
		}
		
	}


