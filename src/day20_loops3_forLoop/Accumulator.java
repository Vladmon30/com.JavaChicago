package day20_loops3_forLoop;

import java.util.Scanner;

public class Accumulator {
public static void main(String[] args) {
	int sum = 0;
	/*
	 * write a program that calculated sm of all numbers
	 * between 1 and 5
	 * 	 */
	//1,2,3,4,5->15
	
	//100+150+200+250+300+350+400+450+500->
	for(int i = 1; i<=5; i++) {
		sum = sum +i;// 1+0=1, 1+1=2, 2+1=3, 3+1=4, 4+1=5. total:  1+2+3+4+5= 15
	}
	System.out.println("sum is " + sum);
	
	/*
	 * Program to calculate the sum of all odd and even number
	 * between 0 and 100
	 * sumOfOdds -> will have all sum of odd number
	 * sumOfEvens-> have all sum of even numbers
	 */
	
	int sumOfOdds = 0;
	int sumOfEvens = 0;
	for(int n = 0; n <= 100; n++) {
		if(n%2==0) {
			sumOfEvens+=n;
			// or sumOfEvens=sumOfEvens + n; // its a same
		}else {
			sumOfOdds = sumOfOdds + n;
		}
	}
	System.out.println("SumOfOdds" + sumOfOdds);
	System.out.println("SumOfEvens" + sumOfEvens);
	}
	
}

