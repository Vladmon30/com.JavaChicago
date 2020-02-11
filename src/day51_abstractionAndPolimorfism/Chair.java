package day51_abstractionAndPolimorfism;

/*
 * CHICAGO BATCH 10 - Abstraction Task 
 * 
 * 1.Create abstract class Chair. 
 * Instance variables: model, weightCreate abstract methods: void sit, void stepOnIt
 * 
 * 2. Create non-abstract class Aeron. Extend to Chair and implement abstract methods. 
 * Simply print “sitting on Aeron chair” and “stepping on Aeron char”
 * 
 * 3. Create non-abstract class Humanscale. Extend to Chair and implement abstract methods. 
 * Simply print “sitting on Humanscale chair” and “stepping on Humanscale chair”
 * 
 * 4. Create Interface Rollable. Declare 2 abstract methods.
 * Void rollBack,  void rollForward.
 * 
 * 5. Create Interface Collapsible. Declare 4 abstract methods:
 * Void lock, void unlock, void fold, void unfold. 
 * 
 * 6. Implement Rollable in Aeron class. 
 * 
 * 7. Implement both Rollable and Collapsible in Humanscaleclass.
 * 
 */






//1.Create abstract class Chair. Instance variables: model, weight
public abstract class Chair {
	String model;
	int weight;
	
//Create abstract methods: void sit, void stepOnIt
	
	public abstract void sit();
	public abstract void stepOnIt();

}
