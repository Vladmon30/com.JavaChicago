package day45_inheritance;

import java.util.ArrayList;
import java.util.List;

public class School {

	/*
	 * 1.Create a class School Instance variables: name, courses(list of string),
	 * totalStudents, location
	 * 
	 * 2*Create constructor that accepts name and location. Set those values to instance variables. 
	 * Also instantiate courses within the
	 * constructor.
	 * 
	 * 3*Create no-argument constructor and instntiate courses variable
	 * inside this constructor. 
	 * 
	 *4 *Encapsulate all instance variables. Make sure user
	 * shouldn’t be able to set negative number to totalStudents. 
	 * 
	 * 5*Create method teach. Void no argument method. Simply print “teaching”
	 * 
	 * 6*Create method teach.
	 * Void and accepts one string(course) and print “teaching course:
	 * %course”
	 * 
	 * 7*Create method addCourse. Void and accepts one string(course) and
	 * adds this course to list of courses.
	 * 
	 * 
	 * 
	 * 
	 */

	
	
	//* 1.Create a class School Instance variables: name, courses(list of string),
	//* totalStudents, location
	
	private String name;                                    //4  encapsulate all variables
	private List<String> courses;
	private int totalStudents;
	private String location;

	
	//*Create constructor that accepts name and location. Set those values to instance variables. 
	// Also instantiate courses within the constructor.
	
	public School(String name, String location) {
		this.name=name;
		this.location=location;
	    courses= new ArrayList<>();
	}
		public School() {
			courses = new ArrayList<>();		
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public int getTotalStudents() {
		return totalStudents;
	}
	public void setTotalStudent(int totalStudents) {
		if(totalStudents<0) {
			System.out.println("Invalid total students data");
		}
		else{
			this.totalStudents= totalStudents;
	}
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	//5*Create method teach. Void no argument method. Simply print “teaching”
	public void teach () {
		System.out.println("Teaching");
	}
//	* 6*Create method teach.
//	 * Void and accepts one string(course) and print “teaching course:
//	 * %course”
	public void teach (String course) {
		System.out.println("Teaching courses: " + course);
}
	public void addCourse(String course) {
		courses.add(course);
	}
}
