package day19_loops2;

public class SlowlyPrintMyNumbers {
public static void main(String[] args) throws InterruptedException {
	int num = 1; 
	while (num <= 10) {
		System.out.print(num + " "); // add space to our program
		++num; // add one to num
		Thread.sleep(1000);//printing number in slow mode- 1000mls = 1sec, 2000mls =2sec
}
}
}
