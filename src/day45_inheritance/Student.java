package day45_inheritance;

//2. Create class StudentInstance variables: name, age, location
public class Student {
	String name;
	int age;
	String location;

// create method study. 
// This method accepts course and doesn’t return anything. 
// Simply print “studying %course”

	public void Study(String course) {

		System.out.println("Studying course: " + course);
	}

// create method takeExam. Method should accept integer and returns boolean. 
// Check if integer is more than 80 return true, else return false;
	
	public boolean takeExam(int point) {
		if (point > 80) {
			return true;
		} else {
			return false;
		}
	}
}