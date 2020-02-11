package intervewQuestion;

public class FindDuplicateNextToEachOther {
	
	public static void main(String[] args) {
		String word = "Vlaad";
		            
for(int n = 0; n < word.length()-1; n++) {
	if(word.charAt(n) == word.charAt(n+1)) {
System.out.println(word.charAt(n)+word.substring(n, n+1));
   }
  }	             
 }
}


