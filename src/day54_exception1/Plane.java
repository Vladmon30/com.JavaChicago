package day54_exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plane {
	public static void main(String[] args){
		System.out.println("Program started");
		
		//File file = new File("file");
		//Scanner sc = new Scanner(file);
		//Thread.sleep(2000);
	
	
	try{	
		File file = new File("file");
		Scanner sc = new Scanner(file);
		Thread.sleep(2000);

	}
	
	catch(FileNotFoundException e) {
	System.out.println("File not found");
}
	
	catch(InterruptedException e) {
		System.out.println("COuldn sleep for 2 seconds");
	}
	System.out.println("End of Program");
}
}