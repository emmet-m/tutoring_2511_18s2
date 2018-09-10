package arithmetic;

public class Constant implements ArithmeticExpression {
	
	private final int val;

	public Constant(int c) {
		this.val = c;
	}
	
	public int value() {
		throw new UnsupportedOperationException("value method in Constant uninplemented!");
	}
}
