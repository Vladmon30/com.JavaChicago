package day54_exception2;

public class Window {
	public static void main(String[] args) {
		try {
			haveFun();
		}

		catch (ProjectorException e) {
			System.out.println("projector exception happened here");
		}
	}

	private static void haveFun() throws ProjectorException {
		System.out.println("Having a good fun");
//		ProjectorException p = new ProjectorException();
//		throw p;
		throw new ProjectorException();
		
	}

}
