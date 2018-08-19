
/**
 * Javadoc is made with a multiline comment, with TWO
 *  stars at the beginning of the comment (see above).
 *  
 * You can identify certain properties of code by adding tags, (see below).
 * 
 * Your javadoc should give a brief overview of what you're documenting,
 *  and you should aim to document every class and method, except boring
 *  getters and setters :)
 *  
 * They don't have to be long, just descriptive!
 *  
 * For example:
 *  
 * 
 * JavadocExample
 * A class to demonstrate the use of javadoc in a java program.
 * 
 * @author Emmet Murray
 *
 */
public class JavadocExample {
	
	/**
	 * public variables and constants should also be documented!
	 */
	public static final int CONSTANTVALUE = 0;
	
	/**
	 * Builds a JavadocExample class.
	 * @param i The input parameter to the constructor
	 */
	public JavadocExample(int i) {
		// Do nothing
	}
	
	/**
	 * A useless function that does nothing
	 * @param meme A string to be printed
	 * @param var A variable to be printed
	 * @return This function always returns 0 :D
	 */
	public int doSomethingUseless(String meme, int var) {
		System.out.println("The string is " + meme + " and the variable is " + var);
		
		return 0;
	}

}
