package day45_inheritance;

public class Dog extends Animal{

	// Parent class, Super class, Base class // Animal
	// Child class, sub class.               // Dog
	
	@Override
	public void slepp() {
		// TODO Auto-generated method stub
		
		super.slepp();
	}
	

	public void bark() {
		System.out.println("Barking");
	}
	
	public void servicing() {
		System.out.println("Servicing");
	}
	
}
