package day51_abstractionAndPolimorfism;

//2. Create non-abstract class Aeron. 
//Extend to Chair and implement abstract methods. 
//Simply print “sitting on Aeron chair” and “stepping on Aeron char”

public class Aeron extends Chair implements Rollable {

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		System.out.println("sitting on Aeron chair");
	}

	@Override
	public void stepOnIt() {
		// TODO Auto-generated method stub
		System.out.println("stepping on Aeron char");
	}

//6. Implement Rollable in Aeron class.
	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		System.out.println("Aeron chir is rolling backward");
	}

	@Override
	public void rollForward() {
		// TODO Auto-generated method stub
		System.out.println("Aeron chir is rolling forward");

	}

}
