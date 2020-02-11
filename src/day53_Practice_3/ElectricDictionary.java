package day53_Practice_3;

public class ElectricDictionary extends Library  {
	
@Override
public void backWordsRead(String str) {

	for(int i = str.length()-1; i >= 0; i--) {
		System.out.print(str.charAt(i));
		
	}
  }
}
