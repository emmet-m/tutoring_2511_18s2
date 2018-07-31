/*
 * @author Aarthi N
 * An example to understand that Java Strings are immutable
 */
public class StringExample {
	
	public static final int BUFSIZ = 0;
	public static final int BIGSIZE = 100000;
	
	public static void main(String[] args) {
		String message = "It is pouring like cats and dogs outside";
		message = message + "and the lightining struck [";

		// This isn't allowed
		// message[0] = 'j';
		
		/*
		 * Consider how strings work in C.
		 * 
		 * Imagine we were to write this program in C, what would
		 * The time complexity be?
		 */
		
		for (int i=0; i <= BIGSIZE; i++){
			message = message + i + ",";
		}
		message = message + "]";
		System.out.println(message);
	}
}
