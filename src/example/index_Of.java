package example;

public class index_Of {
public static void main(String[] args) {
	
//   //	1.String indexOf() :
//	
//	  // Initialising String 
//    String name = new String("Vlad Monchanov"); 
//
//    System.out.print("Found a first at position : "); 
//
//    // Initial index of 'a' will print 
//    // prints 11 							 // 0 1 2 3 4 5 6 7 8 9 10 11 12 13
//    System.out.println(name.indexOf('a'));   // V l a d   M o n c h  a  n  o  v     a - at position 2
//_________________________________________________________________
	
//  // 2.String indexOf(char ch, int strt ) : 
	
//	   // Initialising String 
//      String name1 = new String("Vlad Monchanov"); 
//
//      System.out.print("Found a after 4th index at position : "); 
//
//      // 2nd index of 'a' will print 
//      // prints 10
//      System.out.println(name1.indexOf('a', 4)); 
 //_________________________________________________________________
	
//  //	3.String indexOf(String str) :
//	
//	
//	 // Initialising string 
//    String name = new String("Vlad Monchanov"); 
//
//    // Initialising search string 
//    String substName = new String("Mon"); 
//
//    // print the index of initial character 
//    // of Substring 
//    // prints 5 
//    System.out.print("Found Mon starting at position : "); 
//    System.out.print(name.indexOf(substName)); //5
//_________________________________________________________________	
	
// 4.String indexOf(String str, int strt) :
	
	 // Initialising string 
    String name = new String("Vlad Monchanov"); 

    // Initialising search string 
    String substName = new String("Mon"); 

    // print the index of initial character 
    // of Substring after 14th position 
    // prints 19 
    System.out.print("Found Mon (after 4th index) starting at position : "); 
    System.out.print(name.indexOf(substName, 4)); 
} 
	


}

