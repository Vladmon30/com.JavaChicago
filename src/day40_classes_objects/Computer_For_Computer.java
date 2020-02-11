package day40_classes_objects;

public class Computer_For_Computer {
public static void main(String[] args) {
	
	/*
	 * 4. Create a class ComputerInstance variables: model, color, memory, size,
	 * new(boolean)Instance variables: -> turnOn: void method, print “computer
	 * turning on”-> turnOff: void method, print “%model turning off”
	 * 
	 */
	Computer c1 = new Computer();
	c1.model = "Macbook Pro";
	c1.color = "White";
	c1.isNew = true;
	c1.memory = 256;
	c1.size = 16;
	
	c1.turnOn();
	c1.turnOff();
	Computer c2 = new Computer();
	c2.model = "Dell";
	c2.turnOff();
}
}
