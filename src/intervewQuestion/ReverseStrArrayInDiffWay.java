package intervewQuestion;

public class ReverseStrArrayInDiffWay {

	public static void main(String[] args) {

		String word = "we went to picnic";
					// ew tnew ot cincip
		String[] w = word.split(" ");

		for (String str : w) {
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
			System.out.print(" ");

		}
	}
}
