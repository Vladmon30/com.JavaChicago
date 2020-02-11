package day51_abstractionAndPolimorfism;

import java.io.IOException;
import java.nio.CharBuffer;

//3. Create non-abstract class Humanscale. 
//Extend to Chair and implement abstract methods. 
//Simply print “sitting on Humanscale chair” and “stepping on Humanscale chair”
public class Humanscale extends Chair implements Readable, Collapsible{

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		System.out.println("sitting on Humanscale chair");
	}

	@Override
	public void stepOnIt() {
		// TODO Auto-generated method stub
		System.out.println("stepping on Humanscale chair");
	}
	//7. Implement both Rollable and Collapsible in Humanscaleclass.

	@Override
	public void lock() {
		
		System.out.println("HumanScale chair is locked");
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		System.out.println("HumanScale chair is unlocked");
	}

	@Override
	public void fold() {
		// TODO Auto-generated method stub
		System.out.println("HumanScale chair is fold");
	}

	@Override
	public void unfold() {
		// TODO Auto-generated method stub
		System.out.println("HumanScale chair is unfold");
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}



	}



