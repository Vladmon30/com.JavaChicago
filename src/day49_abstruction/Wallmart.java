package day49_abstruction;

public class Wallmart {
	public static void main(String[] args) {
		MacBook m = new MacBook();
		m.calculate();
		m.charge();
		
		Nokia n = new Nokia();
		n.call();
		n.receiveCall();
		n.sendSMS();
	}
}
