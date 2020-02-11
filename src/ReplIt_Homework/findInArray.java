package ReplIt_Homework;

public class findInArray {
public static void main(String[] args) {
	

    String[] fewValues = {"zero", "one","three"};

			int i = 0;
			for(String each : fewValues) {
				if(each.contains("e")) {
					fewValues[i] = each;
					i++;
				}
			}
			for(String val : fewValues) {
				System.out.println(val + " ");
}
}
}