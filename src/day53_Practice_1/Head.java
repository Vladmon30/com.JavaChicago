package day53_Practice_1;

public class Head {
	public static void main(String[] args) {

		Headphones headphones = new Headphones();

		headphones.setType("abc");
		System.out.println(headphones.getType());

		headphones.setPrice(350);
		System.out.println(headphones.getPrice());

		headphones.setSoundQuality("medium");
		System.out.println(headphones.getSoundQuality());

	}
}
