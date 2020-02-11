package day49_abstruction;

public class MacBook extends Computer {

	@Override
	public void charge() {
		System.out.println("Macbook is charging");
	}

	@Override
	public void turnOn() {
		System.out.println("Macbook is turnOn");
	}

	@Override
	public void TurnOff() {
		System.out.println("Macbook is turnOff");
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Macbook is calculate");
	}

}
