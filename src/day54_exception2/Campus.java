package day54_exception2;

public class Campus {
	public static void main(String[] args) {
		String s = "James";
		

		try {
			Thread.sleep(2000);
			System.out.println(s.charAt(12));
			
		} catch (InterruptedException e) {
			System.out.println("Some interruption happened here");
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		} finally {
			System.out.println("This is finally block");
		}

		System.out.println("End of program");
	}
}
