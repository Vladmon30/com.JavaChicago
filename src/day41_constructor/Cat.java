package day41_constructor;

public class Cat {
	String gender;
	String breed;
	boolean shy;
	int age;
	String color;
	String behavier;

	public Cat(String gender1, String breed1, int age1) {   // overload constructor
		
		gender = gender1;
		breed = breed1;
		age = age1;		
	}
	
	public Cat(String gender1, String breed1) {     // public Cat - it is a constructor,  constructor should have a same name as a class
		gender = gender1;
		breed = breed1;
			System.out.println("Cat constructor is getting called");	
	}
	
	
	public void eat() {
		System.out.println("Cat eating");
	}
}
