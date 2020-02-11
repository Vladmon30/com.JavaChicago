package day54_exception2;

public class Alumni{

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("James Bond");
		
		try {
			p.setAge(-45);
		} 
		catch (InvalidAgeException e) {
			System.out.println("age problem here");
		}
System.out.println("Age is:" + p.getAge());
try {
	p.eat("apple");
	p.eat("orange");
}
catch (AppleException e) {
	System.out.println("Cannot eat apple");
}
	}
}