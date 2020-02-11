package day50_abstraction_task;

public abstract interface Inter {
	
	//public static final int age=22;
	// it cant be just declared like 'int age;'.
	
	
	public abstract void play();
	
	public static void staticMethod() {
		System.out.println("This is some method with body in interface");
	}
	public default void defaultMethod() {
		System.out.println("this is some default method in interface");
	}
}


