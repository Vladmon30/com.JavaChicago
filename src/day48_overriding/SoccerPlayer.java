package day48_overriding;

import day45_inheritance.Dog;

public class SoccerPlayer extends Human{
	
 int jerseyNumber;
 String name;
 
 @Override                                             // override method
 public void run() {
	System.out.println("Soccer player is running");

}
 @Override
 public Dog hunt() {
	 return null;
 }
 
 
 public void train() {
	 System.out.println("Soccer player is training");
 }
 
 public void bycicleKick() {
	 System.out.println("Soccer player is bycicle kicking");
 }
}
