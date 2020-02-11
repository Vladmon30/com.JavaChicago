package example;

public class split {
public static void main(String[] args) {
	 String Str = new String("hi-hello-hey");
    // System.out.println("Return Value :" );
     
   //  for (String retval: Str.split("-", 2)) {
   //     System.out.println(retval);
   //  }
  //   System.out.println("");
  //   System.out.println("Return Value :" );
     
   // for (String retval: Str.split("-", 3)) {
    //    System.out.print(retval);                 			 // hihellohey
    // }
   //  System.out.println("");
    // System.out.println("Return Value :" );
     
     for (String retval: Str.split("-", 0)) {
        System.out.println(retval);
     }
     System.out.println("");
  }
}

