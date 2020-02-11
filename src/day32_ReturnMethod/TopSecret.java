package day32_ReturnMethod;

public class TopSecret {
	public static boolean sendMessageToDT(String message) {

		// some coding that send 'message' to 773-123-4567.

		if (!message.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
