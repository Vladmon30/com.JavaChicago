package day09_conditionals3;

public class RangeTests {
public static void main(String[] args) {
	int students = 65;
	
	//
	// check if students is more than 5 and less than 30
	// print "lets do mentoring session"
	// student more than or equal to 30 and less than or equal 60.
	// print lets have a lecture
	// if more than 60
	// print how many students need to take class online
	//
	
	if (students >=5 && students < 30) {
	System.out.println("Lets do mentoring session");
	
	}else if (students >=30 && students <= 60) {
	System.out.println("Lets have a lecture");
	
	}else if(students > 60) {
		int online = students - 60;
		System.out.println(online + "students need to join class online");
	}else {
		System.out.println("Students need to be more than or equal to 5");
}
}
}
