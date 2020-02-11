package day39_customClasses;

import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

public class ObjectExamples {
public static void main(String[] args) {
	
	
	Iphone myPhone = new Iphone();   // object creation
	
	myPhone.model = "Iphone 8 Plus";
	myPhone.memory = 64;	
	myPhone.model = "7";
	myPhone.color = "Silver";
	
	System.out.println(myPhone.memory);   // 64
	System.out.println(myPhone.color);    // Silver
	
	Iphone kamilsPhone = new Iphone();
	System.out.println(kamilsPhone.model); // we not initialize it no info about kamilsPhone
	
	kamilsPhone.model = "Iphone XS max";   // now we have info
	kamilsPhone.memory = 128;
	kamilsPhone.color = "Gold";

	System.out.println(kamilsPhone.model);
	System.out.println(myPhone.color);
	
	myPhone= kamilsPhone; // my phone start be kamilsPhone and all info from kamilsPhone
	System.out.println(myPhone.model);
	
}
}
