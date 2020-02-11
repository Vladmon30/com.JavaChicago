package day41_constructor;

public class TopGear {
public static void main(String[] args) {
	/*
	 * 2. Create a class Car Instance variables: make, year, sportEdition, mileage
	 * Methods: drive -> print “%year %make is driving” -> increment mileage by 10
	 * 
	 * drive -> accepts String(destination) -> print “%year %make is driving to
	 * %destination” -> increment mileage by 10
	 * 
	 * drive -> accepts integer(mile) -> print “%year %make is driving %mile miles”
	 * -> increment mileage by given mile.
	 */
	
	Car c = new Car();
	c.make="Lexus";
	c.sportEdition = false;
	c.mileage = 1000;
	c.year = 2018;
	System.out.println(c.mileage);
	c.drive();
	System.out.println(c.mileage);
	c.drive(200);
	System.out.println(c.mileage);
}
}
