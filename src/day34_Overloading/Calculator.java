package day34_Overloading;

public class Calculator {
	public static void main(String[] args) {
	//	add(43.1);   // 43, 43.1
		byte b =32;
		char a ='A';
		add(a);
		add(43,23l);		// you shoud choise what number int and what int //just put add(43,23l)
	}

	public static void add(int s) {
//		System.out.println("Int: " + i);  //add 43 its int
		
	}
	
	public static void add(int i, long l) {
		System.out.println("long, int");
		
		
	}
	
	public static void add(long i, int l) {
		System.out.println("long, int");
	}
		

	public static void add(double d) {
//		System.out.println("double: " + l); // add 43.1 its double
		
		
	}

}
