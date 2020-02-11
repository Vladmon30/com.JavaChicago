package ReplIt_Homework;

import java.util.Scanner;

public class SplitEmail {
	public static void main(String[] args) {
		
		/*
		 * Given a String variable email, write code using split method to print email
		 * id and domain in separate lines.
		 * 
		 * Example: email -> info@cybertekschool.com Print: Email id: info Email domain:
		 * cybertekschool.com
		 * 
		 * If email contains no @ character or multiple @ characters then print invalid
		 * email:
		 * email -> hello-gmail.com print: invalid email
		 * email -> my@fancy@email.com print: invalid email
		 */
		
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();
		//info@cybertekschool.com
		int count = 0;
		
		for(int i=0;i<email.length();i++) {  // задаем параметр поиска с нулевого индекса
			
			if(email.charAt(i)=='@') {	     // ищем в имейл проогоняя через каунтер букву '@'
			count++;						 // находим и прогоняем до кнца
			}
		}
		System.out.println(count);
		
		if(count==1) {
				String[] str = email.split("@");  //убераем в имейле букву "@"
				System.out.println("Email id: " + str[0]);  //выводим первое слово
				System.out.println("Email id: " + str[1]);  //выводим второе слово
			
		
		}else {
				System.out.println("invalid email");
				
			}
			
		}
		
	}
	 
  

	
		

		
		

			
	
		
	

