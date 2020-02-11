package day41_constructor;



public class Car1 {
String make;
int year;

public Car1(String make) {
	
	
	this.make = make;  // first make --> point to String make on the top, second--> on the 
	                   // public Car(Sring make)
	
	
	
}
public void drive() {
	Car1 c = new Car1("Lexus");
	c.drive();
	
	this.make = "";
	
	
}
}
