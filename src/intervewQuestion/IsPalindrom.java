package intervewQuestion;

public class IsPalindrom {
 public static void main(String[] args) {
	
	 String word = "boniinob";
	 String rev ="";
	 boolean b;
	 for (int i=word.length()-1;i>=0;i--){
		 rev+=word.charAt(i);
	 }
	 
	 if(!rev.equalsIgnoreCase(word)) {
		  b=false;
		  System.out.println(b);
	 }else {
		 b=true;
		 System.out.println(b);
}
}
}