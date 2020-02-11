package day52_polymorphism;

public interface Organic {

	public abstract void eat ();
	
	default void organicMethod() {
		System.out.println("Organic method in Organic Interface");
	}
	
}
