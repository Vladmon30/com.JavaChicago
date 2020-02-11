package day14_classworks;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner machine = new Scanner(System.in);
		int n1,n2,n3,n4,n5,amount;
		System.out.println("Enter price:");
		
		n1 = machine.nextInt();
		System.out.println("Your item cost: "+n1+"cents"+". You gave 1$");
		System.out.println("so your change will be:");
		
		amount = 100 - n1;
		n2 = amount / 25;
		amount=amount % 25;
		n3 = amount / 10;
		amount=amount % 10;
		n4 = amount / 5;
		amount=amount % 5;
		n5=amount;
		
		System.out.println(n2+ "quarters");
		System.out.println(n3+ "dimes");
		System.out.println(n4+ "nickels");
		System.out.println(n5+ "cents");
		
	}
}
