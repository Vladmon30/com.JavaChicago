package day07_conditionals;

import java.io.Closeable;
import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
	
		/*Program that convert USD to EUR
		 * 					   EUR to USD
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("USD Amount:");
		double $ = scan.nextDouble();
		double usd2eurExchangeRate = 0.86;
		double eur2usdExchangeRate = 1.16;
		
		double euros = $ * usd2eurExchangeRate;
		
		System.out.println($ +" USD= " + euros + " EUR " );
		
		double usdFromEuros = $ * eur2usdExchangeRate;
		
		System.out.println($ +" EUR = " + usdFromEuros + " USD " );
		
		
		
		scan.close();
		
		
	}	
	
}
