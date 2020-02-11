package day38_recab_sb_wrapper_classes;

import org.omg.Messaging.SyncScopeHelper;

public class SB {
	public static void main(String[] args) {
		// immutable --> aka NOT changeable
		// not changeable for original value
		String s = "James";
		System.out.println(s.hashCode()); // s.hashCode() --> memory location for var 's'!!!
		System.out.println("Initial value: " + s);
//		s = s.substring(1, 3);
		System.out.println("After value: " + s);
		System.out.println(s.hashCode());
		String s2 = "James";
		System.out.println(s==s2);  // s.equals(s2)--> true
//----------------------------------------------
// Mutable
// StringBuilder--mutable version of String
// Its original value is changeable
		
		System.out.println("----MUTABLE EXAMPLE----\n");
		StringBuilder sb = new StringBuilder("James");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append(" Bond");   // append method is add method
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb);
		sb.delete(2, 4);                // delete peace of information from position 2 sb 'me'
		System.out.println(sb);
		sb.insert(2, "Hello");			// insert new info inside sb from position 2 "Hello"
		System.out.println(sb);
		System.out.println("-----reverse start-----");
		sb.reverse();
		System.out.println(sb);
		System.out.println("-----reverse end-----");
		String str = "Adam";
		StringBuilder str2 = new StringBuilder(str);
		str2.reverse();
		str = str2.toString();
		System.out.printf(str);
		System.out.println("---");
		System.out.println(sb.capacity());
	}
}
