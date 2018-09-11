package arithmetic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArithmeticExpression {

	@Test
	void testBasic() {
		ArithmeticExpression t1 = 
				
				new Operator('+', 
						new Constant(1), 
						new Constant(1));
		
		assertEquals(2, t1.value());
	}
	
	@Test
	void testMoreComplex() {
		// Tests that operators are the right way around
		ArithmeticExpression t1 = new Operator('-', new Constant(2), new Constant(1));
		assertEquals(1, t1.value());
	}
	
	@Test
	void testEvenMoreComplex() {
		ArithmeticExpression t1 = new Operator('-',
				  new Operator('+', new Constant(1), new Constant(1))
				, new Constant(1));
		assertEquals(1, t1.value());
	}

}
