package day37_wrapper_class;

public class SB {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("James");
		
		sb.append(" Bond");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.reverse());
		sb.insert(0, "HELLO");                 //put HELLO inside variable
		System.out.println(sb);
		
//		String s = "James";
//		System.out.println(s.hashCode());
//		s = s + " Bond";
//		System.out.println(s);
//		System.out.println(s.hashCode());
		
		
		
	}
}
