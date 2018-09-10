package arithmetic;

public class Operator implements ArithmeticExpression {

	private final char operator;
	// Left and right nodes??? 
	// TODO TODO TODO TODO TODO TODO
	
	public Operator(char op) {
	}

	/**
	 * @pre True (only constructed Operator's are valid)
	 * @post the value of the collapsed expression
	 */
	public int value() {
		throw new UnsupportedOperationException("Value() not implemented in Operator");
	}

}
