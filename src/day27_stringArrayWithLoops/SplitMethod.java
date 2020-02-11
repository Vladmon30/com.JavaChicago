package day27_stringArrayWithLoops;

public class SplitMethod {
public static void main(String[] args) {
	String words = "java-selenium-cucumber-testing-junit-eclipse-maven-git-github";
	
	String[] splittedWords = words.split("-");
	
	//print all splitted words
	System.out.println(splittedWords.length); //9
	
	//print the first word in this split
	System.out.println(splittedWords[0]); //java
	
	//print all words in split
	
	for(String w : splittedWords ) {
		System.out.println(w);  //java,selenim,cucumber,testing,junit,eclipse,maven,git,github
		
	}
	
	String searchResult = "All categories 'wooden spoon' 13,623 Results.";
	//if you have a sentence as a string, how  do u find out how many words in it?
	
	String[] arrResult = (searchResult.split(" "));
	
	System.out.println("Words count: " + arrResult.length);
	
	System.out.println(searchResult.split(" ").length);
	System.out.println(searchResult.split(" ")[0]);
	
	//extract number of wooden spoon results and print out
	
	System.out.println("Wooden spoon count: " + arrResult[4]);
	
	
	
	
}
}
