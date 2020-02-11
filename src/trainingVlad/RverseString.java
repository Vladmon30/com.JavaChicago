package trainingVlad;

public class RverseString {
public static void main(String[] args) {

	String n ="abcd";
	
	String rev= "";
	
	for(int i = n.length()-1;i>=0;i--) {
		rev+=n.charAt(i);
	}
	System.out.println(rev);
}
}