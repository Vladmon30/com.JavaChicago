package day54_exception2;

public class Person{
//-----------------------------
	
	
	//------------------

	private String name;
	private int age;
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		if(age<0 || age>120) {
			throw new InvalidAgeException();
		}
		this.age = age;
	}
	public void eat(String food) throws AppleException{
		if(food.equalsIgnoreCase("apple")) {
			throw new AppleException();
		}
		if(food.equalsIgnoreCase("orange")) {
			throw new OrangeException();
		}
		System.out.println("Pearson is eating" + food);
		
	
}
}