package day16_reviewsession1;

public class BooleanWithAndWithOutIf {
	public static void main(String[] args) {
		/*
		 * <, <=, >, >=, !=, ==
		 * &&, ||, !, ^ 
		 * 
		 * &, && (short circuit): //     (and)
		 * 
		 * & will test both condition
		 * && will not test both condition if first one false
		 * 
		 * 5 > 6 & 4 > 5      false & false -> false
		 * 5 > 6 & 4 > 5  ->  false, and will not test second condition
		 * 6 > 3 && 4 > 5 ->  false, false test both because first true, second need test too
		 * 
		 *  
		 * |, || (short circuit) //     (or)
		 * 
		 * false | true ->  true
		 * 5 > 6 || 4 > 5 -> false
		 * 6 == 6 || 3 == 1 -> true and 3 == 1 not be tested
		 * 
		 */
		
		boolean b = 12 > 10;
		System.out.println(b); // 12 > 10 true
		b = 12 > 10 && 10 < 15;
		System.out.println(!!!!!!!!!!!b); // false
		
		System.out.println(b); //true
		
		b = !b;
		System.out.println(b); //false
		
		int zipCode = 21999;
		
	//         false      and     true
		if (zipCode>=22102 & zipCode<=22200) {
		System.out.println("McLean"); 
	}else {
		System.out.println("Not McLean"); 
		
		System.out.println(zipCode);
		
		
		
	}
  }
}
