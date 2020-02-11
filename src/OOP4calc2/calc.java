package OOP4calc2;

 class Calc {
	private int x;
	private int y;
	private int result;

	public int getResult(){
	  return result;
	}

	public  void setY(int y){
	  this.y=y;
	}  
	public  void setX(int x){
	  this.x = x;
	}

	public int plus(){
	  result = x+y;
	  return result;
	}
	  public int minus(){
	    result= x-y;
	    return result;
	  }
	}
 
