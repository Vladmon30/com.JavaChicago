package intervewQuestion;

public class ReverseStringArray {

 public static void main(String []args) {
	  String [] names = {"Vlad", "Maryna", "Denys", "Polina"};
	  String rev= " ";
	  
	  	for(int i=names.length-1;i>=0;i--) {
	  		rev= names[i];
	  		System.out.print(rev + " ");
	  	}	  	  	
	 }
 }
