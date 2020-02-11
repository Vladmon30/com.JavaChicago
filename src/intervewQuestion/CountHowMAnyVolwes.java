package intervewQuestion;

public class CountHowMAnyVolwes {
		public static void main(String [] args) {
			String word = "mamaghe";
			
			int count=0;
			
			for(int i = 0; i<word.length(); i++) {
				if(word.charAt(i)=='a'|| word.charAt(i)=='e') {
					count++;
				}
			}
			System.out.println(count);
			
		}
}
