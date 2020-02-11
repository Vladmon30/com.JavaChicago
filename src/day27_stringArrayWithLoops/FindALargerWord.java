package day27_stringArrayWithLoops;


public class FindALargerWord{
	public static void main(String[] args) {
		
		/*
		 * 
		 * Given the array words, it will print the word with the largest length. Assume
		 * that there are no 2 words with longest length Example: words -> ["aaa",
		 * "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"] prints
		 * jaaaaavvaaaaaaaaaa
		 * 
		 */
		
		String[] words = { "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa" };
	
		
//		String str = "find the most min length in string"; // это исходная строка
//		String[] strArr = str.split(" "); // тут делим ее на отдельные слова, по пробелу
//		String minLen = strArr[0]; // Здесь предполагаем что первый элемент в массиве самый короткий
//
//		// Тут последовательно сравниваем длину элементов массива, и если есть короче чем в переменной minLen, заносим ее туда
//
//		for (String e : strArr) {
//		if (e.length() < minLen.length()) {
//		minLen = e;
//		}
//		}
//
//		System.out.print(minLen); // тут вывод на экран


		String longest= "";
		
		for(String str:words) {
			str.split(" ");
			if(str.length()>longest.length()) {
				longest=str;
			}
			System.out.println(longest);
		}
		
	}
}
