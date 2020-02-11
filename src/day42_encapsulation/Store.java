package day42_encapsulation;

public class Store {

	public static void main(String[]args){
		Apple a = new Apple();
		a.setColor("whatever");
		a.size=-23;
		
		System.out.println(a.getColor());
		System.out.println(a.size);
		
		Human h1 =new Human();
		h1.setAge(50);
		System.out.println(h1.getAge());
		h1.setGender("male");
		System.out.println(h1.getGender());
		
		
		
	//	System.out.println(a.color);
	//	a.color = "white";
	//	System.out.println(a.color);
		
		Human h2 = new Human();
		System.out.println(h1.todaysDay);
		h1.todaysDay = "November, 6 2018";
		System.out.println(h2.todaysDay);
		System.out.println(Human.todaysDay);  //November, 6 2018
		
		Human.todaysDay = "Nov, 8 2019";
		System.out.println(h1.todaysDay);  //Nov, 8 2019
	}
	
}
