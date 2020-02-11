package day42_encapsulation;

public class Apple {

	private String color;
	 int size;
	
	public String getColor() {  //  method return color
		return color;
	}
	public void setColor(String color) { // method set color
		if(color.equals("whatever")) {
			System.out.println("No color called: "+ color);
			this.color = "invalid color";
		}else {
		this.color = color;
	}
}
}