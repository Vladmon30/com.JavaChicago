package day45_inheritance;

	//3. Create class CybertekStudent. Extend to Student. *create instance variable batchID.
public class CybertekStudent extends Student {

	int batchId;
	
	public CybertekStudent(){
	super();
  }
	
	public CybertekStudent(int s) {
		batchId=s;
	}
}
