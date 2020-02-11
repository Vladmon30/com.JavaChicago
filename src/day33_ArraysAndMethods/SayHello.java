package day33_ArraysAndMethods;

public class SayHello {
	public static void main(String[] args) {
		sayHello("magic");
		
	}

	public static void sayHello(String password) {
		password = "hello";
		if (password.equals("magic")) {
			System.out.println("Hello World");
		} else {
			System.out.println("Wrong pssword");
			
		}
	}
}