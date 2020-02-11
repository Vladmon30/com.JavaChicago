package day32_ReturnMethod;

import java.util.Arrays;

public class TwoAndMoreWord {
	public static void main(String[] args) {
		String[] names = { "James Bond", "Obama Care", "Donald Trump Junior", "Adam Smith", "John Wick" };

		String[] myNames = twoAndMoreWords(names);
		System.out.println(Arrays.toString(myNames));
	}

	// Pseudo code:
	// Create a method that takes/accept String array
	// and Return String Array
	// Logic: method should find an element that consist of two or more words and
	// return that
	// Input: ["James Bond", "Donald Trump Junior", "Adam", "John Wick"]
	// Outpt: ["James Bond", "Adam", "John Wick"]

	public static String[] twoAndMoreWords(String[] nameList) {
		int count = 0;     //try to count all names inside array with name and surname
		for (String name : nameList) {
			
			name= name.trim();                    // delete all spaces tabs and lines and make a single line of our data
			if(name.contains(" ")) {              //find all names with surname
				System.out.println(name);
				count++; //count it all
				
			}
					}
		
		String [] newArray = new String[count];    //create new array and save inside all names with surname
		
		
		
		String[] newAArray = new String[count];
		System.out.println("Count is: " + count);
		
		int index = 0;
		for(int i =0; i<nameList.length; i++) {    //do it again to find all name with surname just for check
			
			String names1 =  nameList[i].trim();   //we are create new string to save all this names in a new storage
			
			System.out.println(names1);            //check all names what we have in array
			
			if(names1.contains(" ")) {
				newArray[index] = names1;
				index++;
				
			}
			
	}
		System.out.println(Arrays.toString(newArray));
	return newArray;  								// at the end of this method retrned a newArray with data inside it
}
}
