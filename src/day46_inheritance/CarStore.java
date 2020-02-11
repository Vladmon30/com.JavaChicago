package day46_inheritance;

public class CarStore{
	public static void main(String[] args) {
		
		
		Car toyota = new Car();  //car is a vehicle
		
			toyota.color = "Silver";
			toyota.type = "Camry";
			toyota.year = 2018;
			toyota.isNew = false;
			toyota.miles=250;
			
			toyota.startEngine();
			toyota.stopEngine();
		
		
		Motorcycle kawasaki = new Motorcycle();  //car is a vehicle
			
			kawasaki.color = "Red";
			kawasaki.type = "Ninja";
			kawasaki.year = 2019;
			kawasaki.isNew = true;
			kawasaki.miles = 0;
			
			kawasaki.startEngine();
			kawasaki.stopEngine();
			
			
			Cat cat = new Cat();
			System.out.println(Cat.catDisease);
			
			Car car = new Car();
			car.stop();
			car.drive(); 
			
			System.out.println("==Train==");
			Train train = new Train();
			train.makeAndModel = "CyberTrain 10";
			train.year = 2019;
			train.ticketPrice=120.50;
			
			train.leaveStaion();
			train.stop();
	}
}
