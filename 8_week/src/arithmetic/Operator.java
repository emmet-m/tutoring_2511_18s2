package arithmetic;

public class Operator implements ArithmeticExpression {

	private final char operator;
	// Left and right nodes??? 
	// TODO TODO TODO TODO TODO TODO
	
	public Operator(char op) {
		this.operator = op;

	}

	public int value() {
		throw new UnsupportedOperationException("value method in Operator uninplemented!");
	}

}
