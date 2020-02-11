package day51_abstractionAndPolimorfism;

import java.util.ArrayList;
import java.util.List;

public class Office {
public static void main(String[] args) {
	
//	Aeron aChair = new Aeron();
//	aChair.sit();
//	aChair.stepOnIt();

	//---------------------------
//  Polimorphism example:
	
	Chair a = new Aeron();
	Chair a2 = new Aeron();
	Chair a3 = new Aeron();
	a.sit();
	a.stepOnIt();
	
	//upcasting ex. automaticle happened
	Chair h = new Humanscale();
	
	//Chair h = (Chair)(new Humanscale()); upcasting ex.
	
	
	h.sit();
	h.stepOnIt();
	
	


	((Humanscale)h).lock();
	
	Humanscale temp = ((Humanscale)h);
	
	
	
	temp.unfold();
	temp.unlock();
	
	
	
	 List<Chair> chairs = new ArrayList<>();
	 
	 chairs.add(a);
	 chairs.add(a2);
	 chairs.add(a3);
	 chairs.add(h);
	 
	 for(Chair c:  chairs) {
		 c.sit();
	 }
	 
	
//-------------------------------	

	Humanscale hChair = new Humanscale();
	hChair.sit();
	hChair.stepOnIt();
	hChair.fold();
	hChair.lock();
}
}
