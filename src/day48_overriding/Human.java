package day48_overriding;

import day45_inheritance.Animal;
import day45_inheritance.Dog;

public class Human {
String gender;
int age;

public void run() {
	System.out.println("Human is running");
}
	public Animal hunt(){   // take it from day 45 class Animal class Dog
		Animal a = new Animal();
		return a;
	}
	

public void eat() {
	System.out.println("Human is eating");
}

}

