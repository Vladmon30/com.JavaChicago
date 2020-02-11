package day04_operators;

import java.util.Scanner;

public class Meeting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, what is your name?");	
		String name = scan.nextLine();
		
		System.out.println("Nice to meet you!" + name);
		scan.close();
	}
}
