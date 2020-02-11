package day14_classworks;
// this is the name of the class. everything happenes inside
public class TrimExample {
	public static void main(String[] args) {
		
		String str = " blah blah blah ";
		System.out.println(str);
		//console will print str without the spases
		//but the value of the str is not changes
		
		System.out.println(str.trim());
		// trim() --> deletes writespase in the begining and at the end of the string.
		
		System.out.println(str.length());
		// count all words and spases in strim
		
		System.out.println(str.trim().length()); 
		// delited spase and count all words(14 words in blah blah blah)
		//chaining --> calling method one after another
		
		// str = str.trim();
		// now we are reassign the resoult
		
	//##############################
		
		
		
		
	}
}
