package day52_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Market {

		public static void main(String[] args) {
			Apple a = new Apple();
			a.fruitMethod();
			a.appleMethod();
//			
//			Fruit f = new Apple();
////			f.fruitMethod();
//			
//			List<Apple> apples = new ArrayList<>();
//			apples.add(a);
//			Orange o = new Orange();
//			apples.add(a);
//			
//			List<Fruit>fruits = new ArrayList<>();
//			fruits.add(o);
//			fruits.add(a);
//			fruits.add(f);
//			
//		for(Fruit ff: fruits) {
//			ff.fruitMethod();
//			
//			
//		}
//		Organic or = new Apple();
//		or.eat();
//		or.organicMethod();
			
			Food f = new Apple();
			Apple ff = (Apple)f; //--> Dawn casting method
			ff.eat();
			System.out.println(f.hashCode());
			System.out.println(ff.hashCode());
			
			Organic or = ff;  //-->Up casting method   Organic or = ff;
			
//			f.showFood();
//			Fruit ff = (Fruit)f;
//			ff.fruitMethod();
//			ff.showFood();
//			Apple a = new Apple();
//			a.eat();
//			a.showFood();
			
	}
}
