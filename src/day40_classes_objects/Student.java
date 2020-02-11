package day40_classes_objects;

public class Student {
	/*
	 * 5. Create a class StudentInstance variables: name, age, emailInstance
	 * methods: read -> this method should not return anything and doesn’t accept
	 * anything. Simply print out “student %studentName is reading”read -> this
	 * method should not return anything. It accepts Book data type and simply print
	 * out “student %studentName is reading %bookTitle by %authorName”
	 */
	
	String name;
	int age;
	String email;

	public void read() {
		System.out.println("Student " + name + " is reading.");
	}

	public void read(Book book) {
		System.out.println("Student " + name + " is reading " + book.title + " by " + book.author);
	}

}
