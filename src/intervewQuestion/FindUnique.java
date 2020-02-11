package intervewQuestion;

public class FindUnique {
	public static void main(String[] args) {

		String word = "AABCCDD";
		// 0,1,2,3,4,5,6
		String unique = "";


		for (int i = 0; i < word.length(); i++) {
		//	System.out.println(word.substring(i, i + 1));
			String letter = word.substring(i, i + 1);
			if (!unique.contains(letter)) {
				unique = unique + letter;
			}
		}

		System.out.println(unique);

	}
}
