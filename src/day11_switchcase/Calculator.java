package day11_switchcase;

public class Calculator {
public static void main(String[] args) {
	double num1, num2, resoult;
	char operator;
	
	num1 = 55;
	num2 = 33;
	operator = '-'; 
	            //+,-,*,/,%.
	
	switch(operator) {
	case '+':
		resoult = num1 + num2;
		break;
	case '-':
		resoult = num1 - num2;
		break;
	case '*':
		resoult = num1 * num2;
		break;
	case '/':
		resoult = num1 / num2;
		break;
	case '%':
		resoult = num1 % num2;
		break;
	default:
		System.out.println("ERROR:Invalid Operator selected");
		return;//don't run the rest of code below
			   //get out of main method right here
	}
		System.out.println(resoult);
}
}
