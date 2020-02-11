package day46_inheritance;

public class Cat {
	
	String name;
	int age;
	static boolean catDisease;
	
	{
		System.out.println("Hey guys");
		name = "Chili";
		age = 1;
	}

	static {
		System.out.println("Hey guys from static initializer");
		catDisease = false;
	}
	
	static {

		System.out.println("Static block second");
	
	}
}
