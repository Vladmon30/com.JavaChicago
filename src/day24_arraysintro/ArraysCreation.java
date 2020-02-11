package day24_arraysintro;

public class ArraysCreation {
	public static void main(String[] args) {
		// declare array that can hold 5 items
		int[] numbers = new int[5];
		// assign values
		// 0,1,2,3,4
		//1 way of the way to declare a values
		numbers[0] =234;
		numbers[1] = 432;
		numbers[2] = 100;
		numbers[3] = 54;
		numbers[4] = 7654;
				
		//2 way
		// int numbers = {234,432,100,54,7654};
		
		//3 way
		//int[] numbers = new int[] {234,432,100,54,7654};
		
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		
		//you can change the value in items, but can not change the value of items
		numbers[0] = 1000; 
		System.out.println(numbers[0]);
		// we can add value with each other
		numbers[1] = numbers[2] + numbers[3];
		System.out.println(numbers[1]);
		
		//declare a char array grades and assign A,B,C,D,E to it
		//use any one of 3 different ways
		
	//----------------------------------------------------------------
	
		char[] grades = new char[]{'A','B','C','D','E'};
		
		//char[] grades = {'A','B','C','D','E'};
		
		//char[] grades = new char[5];
		//grades[0] ='A';
		//grades[1] ='B';
		//grades[2] ='C';
		//grades[3] ='D';
		//grades[4] ='E';
		
		
		// print first item
		System.out.println(grades[0]);
		
		char myGrade = grades[1];
		System.out.println(myGrade);
		
		
		// Its a same we can declare as is both way
		
		String[] cities = new String[3];
		cities = new String[3];
		
		cities[0]="Washington";
		cities[1]="Los Angeles";
		cities[2]="New York";
		
		String cities2;
		// you can not declare another values 
	//	cities2 = {"Chicago", "McLean", "Miami"}

	}
}
