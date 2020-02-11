package intervewQuestion;

public class ReverseString {
public static void main(String[] args) {

// 1 ex:
	String word ="Vlad Olegovich Monchanov";
	String rev= "";
		for(int i = word.length()-1;i>=0;i--) {
			rev = rev + word.charAt(i);
		}
		
		System.out.println(rev);
		
System.out.println("---2EX:-----");
	
//2ex:
	
	String [] sc = word.split(" ");
		for(int n = sc.length-1; n >=0; n--) {
			System.out.print(sc[n]+" ");
	}
	
	
}
}