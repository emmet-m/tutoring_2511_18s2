package arithmetic;

public class Operator implements ArithmeticExpression {

	private final char operator;
	// Left and right nodes??? 
	private final ArithmeticExpression left;
	private final ArithmeticExpression right;
	
	public Operator(char op, ArithmeticExpression l, ArithmeticExpression r) {
		this.left  = l;
		this.right = r;
		this.operator = op;
	}

	/**
	 * @pre True (only constructed Operator's are valid)
	 * @post the value of the collapsed expression
	 */
	public int value() {
		
		switch (this.operator) {
		case '+':
			return this.left.value() + this.right.value();
		case '*':
			return this.left.value() * this.right.value();
		case '-':
			return this.left.value() - this.right.value();
		case '/':
			return this.left.value() / this.right.value();
		default:
			throw new UnsupportedOperationException("Unsupported operation.");
		}
	}

}
