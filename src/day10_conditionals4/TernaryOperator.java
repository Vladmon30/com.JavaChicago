package day10_conditionals4;

public class TernaryOperator {
public static void main(String[] args) {
	/*
	 * max score 100. Passing score is 60
	 * 
	 */
	int score = 50;
	String status;
	/*
	 * 1 do use if else
	 * 
	 */ 
	if(score >=60) {
		status = "pass";
	}else {
		status ="fail";
	  
	 /* 2 using ? (ternary operator)
	 */
	
	//status = (score >=60) ? "pass" : "fail";
	System.out.println(status);
	
	
	boolean express = true;
		System.out.println((express) ? 25 : 15);
	
	int shipping = (express == true) ? 25 : 15;
		System.out.println(shipping);
		
}
	
}	
}
