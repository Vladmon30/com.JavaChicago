package day04_operators;

public class AgeCalculator {
	public static void main(String[] args) {
		int currentYear = 2018;
		int yearOfBirth = 1984;
		int age = currentYear - yearOfBirth;

		System.out.println("If you are born on " + yearOfBirth + " year then you are " + age + " year old.");
		String output = "If you are born on " + yearOfBirth + " year then you are " + age + " year old.";
		System.out.println(output);
		// CTRL+SHIFT+F -->make it clean and looks good(windows)
		// Command+Shift+F -->make it clean and looks good(IOS)
	}
}
