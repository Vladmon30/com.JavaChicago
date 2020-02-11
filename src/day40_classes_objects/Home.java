package day40_classes_objects;

public class Home {
	public static void main(String[] args) {
		/*
		 * 1.Create a class House. 
		 * Instance variables: type, address, numRooms
		 * Create 4 Objects from House in different class 
		 * and call set values for each properties
		 */

		House myHouse = new House();
		
		myHouse.type = "Capitoliy";
		myHouse.adress = "1020 Lincoln Ave";
		myHouse.numRoom = 20;
		

		House newHouse= new House();
		
		newHouse.type = "Town";
		newHouse.adress = "1111 Manhaim Ave";
		newHouse.numRoom = 40;
		
		House oldHouse = new House();
		oldHouse.type = "Apartment";
		oldHouse.adress = "8532 Rascher Ave";
		oldHouse.numRoom = 6;
		
		House townHouse = new House();
		townHouse.type = "building";
		townHouse.adress = "400 Colon Ave";
		townHouse.numRoom = 1;
		
		System.out.println(newHouse.adress);
		System.out.println(newHouse.numRoom);
		
		
	}
}
