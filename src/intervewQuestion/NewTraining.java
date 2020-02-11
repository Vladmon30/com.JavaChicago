package intervewQuestion;

public class NewTraining {
	public static void main(String[] args) {
		String name = "Vlad";
		String revName = "";

		for (int i = name.length()-1;i>=0; i--) {
			revName = revName + name.charAt(i);
			
		}
		System.out.print(revName);
	}

}
