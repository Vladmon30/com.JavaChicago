package day34_Overloading;

public class Survival {
	public static void main(String[] args) {
		
		
	}

	public static void Hi(String name) {
		System.out.println("Hi" + name);

	}

	public static void Hi(int name) {
		System.out.println("Hi" + name);
		
	}

	public static void Hi(String name, String name2) {
		System.out.println("Hi" + name);
		System.out.println("Hi" + name2);
		
	}

	public static String sayHello() {
	
		return "Hello";
	}
	}

