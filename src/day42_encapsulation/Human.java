package day42_encapsulation;

public class Human {

	/*
	 * Classs Human instance variables: gender, age Encapsulate variables. Generate
	 * getters and setters age has to be beetwen 0-150. gender has to be male or
	 * female only
	 * 
	 */

	
	private String gender;
	private int age;          
	
	static String todaysDay;  // 'static' its belong to each object in class its same for all object in class
	
	public String getGender() {
		return gender;
	}
	
	public int getAge(){ 
		return age;
	}
	
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
			this.gender= gender;
		}
}
		public void setAge(int age) {
			if(age >=0 && age <= 150) {
				this.age = age;
				
			}
		}
		
		
}
