package day43_practice;

public class CarApp {
	public static void main(String[] args) {

		/*
		 * Create instance variable hatchback, suv, sedane, truck
		 * And assign it to different vehicle;
		 * create an array of vehicle
		 * Store all the instance in that array
		 * Loop throu and print out all values in it
		 * 
		 */
		
		
		
	Vehicle hatchback = new Vehicle();

		hatchback.year = 2018;
		hatchback.brand = "Toyota";
		hatchback.model = "Camry";
		hatchback.miles = "100";
		hatchback.price = "30000";

	Vehicle suv = new Vehicle();
		suv.year = 2017;
		suv.brand = "Lexus";
		suv.model = "RX-350";
		suv.miles = "200";
		suv.price = "50000";

	Vehicle sedane = new Vehicle();
		sedane.year = 2016;
		sedane.brand = "BMW";
		sedane.model = "M-5";
		sedane.miles = "300";
		sedane.price = "40000";
		
	Vehicle truck = new Vehicle();
		truck.year = 2015;
		truck.brand = "GMC";
		truck.model = "Savanna";
		truck.miles = "600";
		truck.price = "80000";
		
		System.out.println("All vehicles in the lot: ");
		
		Vehicle[] vehicleArr = {hatchback, suv, sedane, truck};
		for(int i = 0; i < vehicleArr.length; i++) {
			
			
			System.out.println("--------------");
			System.out.println("Brand" + vehicleArr[i].brand);
			System.out.println("Miles" + vehicleArr[i].miles);
			System.out.println("Price" + vehicleArr[i].price);
			System.out.println("Year" + vehicleArr[i].year);
		}
	}
}