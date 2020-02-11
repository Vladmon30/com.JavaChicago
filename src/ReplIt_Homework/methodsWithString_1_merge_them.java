package ReplIt_Homework;

public class methodsWithString_1_merge_them {
	 public static String mergeStrings(String one, String two) {
		 String merge= "";
	      String s1 = "12345"; 
	        String s2 = "abcde";
	        for (int i = 0; i < s1.length(); i++) {
	            for (int j = i; j < s2.length(); j++) {

	                merge = (s1.charAt(i) + "" + s2.charAt(j));
	                break;
	     }
	    }
			return merge;
	  }
	}

