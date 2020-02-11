package day46_inheritance;

public class Vehicle {

	String  type;
	String color;
	int year;
	double miles;
	boolean isNew;
	public String makeAndModel;


public void startEngine() {
	System.out.println("Engine is starting");
}
public void stopEngine() {
	System.out.println("Engine is stoping");
	
}
public static void fixVehicle(String date) {
	
	System.out.println("Vehicle is getting fixed on:" + date);
}
public void stop() {
	System.out.println("Stopping");
}
public void drive() {
	System.out.println("Driving");
}

}