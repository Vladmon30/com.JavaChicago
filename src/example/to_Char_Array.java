package example;

public class to_Char_Array {
public static void main(String[] args) {
	String  name = "Vlad Monchanov";
	char [] charName = name.toCharArray();
	int length = charName.length;
	System.out.println(length); //14
	
	for(int i = 0; i < length; i++) {
		System.out.print(charName[i]); // VladMonchanov
		
		
	}
	
}
}
