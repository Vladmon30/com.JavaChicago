package trainingVlad;

public class StaticBlock_InitBlock {
	
	static{
	System.out.println("runs once");
	}
	
	
	{
		System.out.println("Ran everytime before constractor when ob is created");
	}
	
	
	public StaticBlock_InitBlock() {
		System.out.println("constructor");
	}
}



