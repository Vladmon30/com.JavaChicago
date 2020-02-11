package trainingVlad;

public class SplitTrain {
public static void main(String[] args) {
	String music = "Rock-n-Roll";
	String []splMusic= music.split("-",2);
	for(String temp:splMusic) {
	System.out.print(temp);
}
}
}