package day24_arraysintro;

public class PrintArrayValues {
	public static void main(String[] args) {

		// create an array cars and directly assign following value
		// Moscvich, Audi, Porshe, BMW, Toyota, Honda, Tesla, Dodge, Kia, Acura, Fiat

		String[] cars = new String[] { "Moscvich", "Audi", "Porshe", "BMW", "Toyota", "Honda", "Tesla", "Dodge", "Kia",
				"Acura", "Fiat" };

		// print number of cars
		System.out.println(cars.length);

		int i = 0;
		System.out.println(cars[i]); // Moscvich
		i++;
		System.out.println(cars[i]);// Moscvich, Audi
		i++;
		System.out.println(cars[i]);// Moscvich, Audi, Porshe

		// print all value sing a for loop

		for (int idx = 0; idx < cars.length; idx++) {
			System.out.println(cars[idx]);
		}
		System.out.println("------FOR EACH LOOP------");

		// print all vales using a for EACH loop
		// for(typeofArray tempVariable: arrayName) {

		for (String car : cars) {
			System.out.println(car);
			System.out.println("-------");
		}

		int[] nums = { 4, 6, 3, 1, 4 };
		for (int n : nums) {
			System.out.println(n);

		}
	}
}
