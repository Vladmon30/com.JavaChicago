package intervewQuestion;

public class BuildTriangle {
	
public static void main(System[]args) {
printTriangle(5);

}
	public static void printTriangle(int rows) {
		if(rows<=0) {
			System.out.println("");
			return;
		}
	for(int i=rows;i>=0;i--) {
		for(int j=0;j<rows;j++) {
			if(j<i) 
				System.out.print(" ");
			
				else if (j ==rows - 1 )
				System.out.println("*");
				else 
					System.out.println("*-");
			}
		System.out.println();
		}
	}
}

