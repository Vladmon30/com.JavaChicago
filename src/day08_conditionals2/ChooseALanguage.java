package day08_conditionals2;

import java.util.Scanner;

public class ChooseALanguage {
	public static void main(String[] args) {
		
		/*
		 * English -> 1
		 * Spanish -> 2
		 * Turkish -> 3
		 * Turkish -> 3
		 * Uyghur -> 5
		 * Uzbek -> 6
		 * Kyrgy -> 7
		 * Tajik -> 8
	 */
		System.out.println("Please select:\n"+
										   "English -> 1 \n"+
										   "Spanish -> 2 \n"+								   		
										   "Turkish -> 3 \n"+
										   "Turkish -> 4 \n"+		
										   "Uyghur -> 5	\n"+	
										   "Uzbek -> 6 \n"+
										   "Kyrgy -> 7 \n"+	
										   "Tajik -> 8" );
		
		Scanner scan = new Scanner(System.in);
		
		int language = scan.nextInt();
		String greeting;
			if (language == 1) {
				greeting = "Hello How are U";
			}else if(language == 2) {
				greeting = "Holla, Como Estas?";	
			}else if(language == 3) {
				greeting = "Merhaba, Nalsilsiniz?";
			}else if(language == 4) {
				greeting = "Privet, kak dela";
			}else if(language == 5) {
				greeting = "kyk dyla?";
			}else if(language == 6) {
				greeting = "Salom Qalesiz?";
			}else if(language == 7) {
				greeting = "Salam, Kandaysiz";	
			}else if(language == 8) {
				greeting = "Salom, Chinel shmo?";
			}else {
				greeting = "I do not speak that laguage";
			}
				System.out.println(greeting);
			 scan.close();
		
				
		}
	}	

