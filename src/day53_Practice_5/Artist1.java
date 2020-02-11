package day53_Practice_5;

//Class Artist1{
//
//	-Extends to Fibonacci
//	-Implement the method
//	-Create a logic where you print out

public class Artist1 extends Fibonacci{


@Override
public void Fibonacci(int i) {
	//0 		1  		1		2
	//num1	num2
	//		num1		num2
	//				num1		num2
	
	int num1=0;
	int num2=1;
	int sum = num1 + num2;
	
	System.out.print (num1 + " " + num2 +  " " + sum + " ");	
	
	while(sum < i) {
		num1 = num2;
		num2 = sum;
		
		sum= num1 + num2;
		if(sum>i) {
			break;
		}
		System.out.print(sum + " ");
	}
	
	
}

@Override
public void beFibonacci(int i) {
	// TODO Auto-generated method stub
	
}

}