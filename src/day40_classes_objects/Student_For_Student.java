package day40_classes_objects;

public class Student_For_Student {
	public static void main(String[] args) {

		/*
		 * 5. Create a class StudentInstance variables: name, age, emailInstance
		 * methods: read -> this method should not return anything and doesn’t accept
		 * anything. Simply print out “student %studentName is reading”read -> this
		 * method should not return anything. It accepts Book data type and simply print
		 * out “student %studentName is reading %bookTitle by %authorName”
		 */

		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "James";
		s1.age = 40;
		s1.email = "james@gmail.com";

		s2.name = "Adam";
		s2.age = 34;
		s2.email = "adam2018@gmail.com";
		s1.read();
		s2.read();
		Book book = new Book();
		book.author = "Mark Devine";
		book.title = "Unbeatable mind";
		book.pages = 400;
		s1.read(book);

	}
}
