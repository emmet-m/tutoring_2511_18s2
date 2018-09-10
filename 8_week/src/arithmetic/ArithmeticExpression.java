package arithmetic;

/*
 * Packages an arithmetic expression
 */
public interface ArithmeticExpression {	
	// Only expose our tree operation here
	public int value();
	
	/* 
	 * Removing these adds type safety... (A Constant will NEVER implement any of these operations)
	 * 
	 * ... But makes the subclasses less uniform!
	 * This also means constructed expressions are immutable (cannot be changed after construction)! 
	 * We no longer have a way to remove/update them once they are cast to an ArithmeticExpression.
	 */

	// public void setLeftChild();
	// public void setRightChild();
	// public void getLeftChild();
	// public void getRightChild();
}
