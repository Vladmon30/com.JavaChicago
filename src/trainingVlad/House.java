package trainingVlad;

public class House {
public static void main(String[] args) {
	
	
	HouseTrain myHouse = new HouseTrain();
	
	myHouse.type = "Capitoliy";
	myHouse.adress = "1020 Lincoln Ave";
	myHouse.numRoom = 20;
	

	HouseTrain newHouse= new HouseTrain();
	
	newHouse.type = "Town";
	newHouse.adress = "1111 Manhaim Ave";
	newHouse.numRoom = 40;
	
	HouseTrain oldHouse = new HouseTrain();
	oldHouse.type = "Apartment";
	oldHouse.adress = "8532 Rascher Ave";
	oldHouse.numRoom = 6;
	
	HouseTrain townHouse = new HouseTrain();
	townHouse.type = "building";
	townHouse.adress = "400 Colon Ave";
	townHouse.numRoom = 1;
	
	System.out.println(newHouse.adress);
	System.out.println(newHouse.numRoom);
}
}