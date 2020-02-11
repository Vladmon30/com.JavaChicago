package example;

public class substring {
public static void main(String[] args) {
	
	String name = new String("Vlad Monchanov");

    System.out.print("Return Value :" );
    System.out.println(name.substring(4) ); //Monchanov
    
    
    String newName = "Vlad junior Monchanov";
    System.out.println(newName.substring(4,11));  // junior
    
}
}
