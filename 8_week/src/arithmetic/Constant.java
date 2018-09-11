package arithmetic;

public class Constant implements ArithmeticExpression {
	
	private final int val;

	public Constant(int c) {
		this.val = c;
	}
	
	public int value() {
		return this.val;
	}
}
