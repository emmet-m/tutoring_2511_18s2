package access.package2;

import access.package1.A;

public class D {

	public void methodD() {
		// A class D in another package to a class A 
		// has only access to variables in A with public scope
		
		A objA = new A();
		// If I uncomment this?
//		System.out.println("var: " + objA.var);
		System.out.println("varPub: "  + objA.varPub);

	}
}
