package day28_EssenClass;

public class ArraysUtility {
	public static void main(String[] args) {
		
		String[] students = new String[70];
		for (String student : students) {
			if (student.equals("James")) {
				System.out.println("True");
				break;
			}
		}

	}
}
