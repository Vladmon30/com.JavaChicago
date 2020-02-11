package day14_classworks;
//this is the name of the class. everything happenes inside
public class StringAndValues {
	static String str;  // will print null no value assigned
	//declaring the value by default
   public static void main(String[] args) {
	//we are declaring a main method
	   System.out.println(str);  //  assigned value to str
	   
	   str = "a";
	   System.out.println(str);  // will print a
	   
	   str = "b";
	   System.out.println(str);
	   
	   System.out.println(str +"AAA");
	   //printing current value of str b + "AAA" 
	   System.out.println(str);
	   //changing the value of str
	   // str is noteqal to bAAA.
	   str = str + "AAA";
	  //printing current value of str "bAAA"
	  
	   System.out.println(str);
	   
	   
	   
	   String myString = " a "; // created a new variable and gave vale ''
	   							// printing the trimmed version of myString
	   System.out.println(myString.trim());
	   							//prints a value of myString wich still contains spaces
	   
	   System.out.println(myString);
	   
	   System.out.println(str+"ac");
		System.out.println(str);
}
}
