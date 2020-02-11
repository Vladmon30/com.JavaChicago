package day49_abstruction;

public class Nokia extends Phone {
	
	@Override
	public void call() {
		System.out.println("Nokia is calling");
	}
	
	@Override
	public void receiveCall() {
		
		System.out.println();
	}
	
	@Override
	public void sendSMS() {
		System.out.println("send sms");
	}

}
