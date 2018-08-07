package employeemanager;

import java.time.LocalDate;

public class Tester {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(50000,"Emmet");
		Employee e2 = new Employee(50000,"Emmet");
		
		// e1 and e2 are the same
		System.out.println("Should be true: " + e1.equals(e2));
		System.out.println("Should be true: " + e2.equals(e1));

		System.out.println("Should be true: " + e1.equals(e1));
		
		// Random date
		LocalDate ld = LocalDate.now();

		Manager m1 = new Manager(50000, "Emmet", ld);
		
		System.out.println("Should be false: " + m1.equals(e2)); 
		
		// Hm, what should this print?
		// Due to reflexivity, this should be false.
		System.out.println("Should be ????: " + e2.equals(m1));
		
		// What can we conclude about all .equals(), where the input class differs to the object's class?

		// Same random date from before
		Manager m2 = new Manager(50000, "Emmet", ld);
		
		System.out.println("Should be true: " + m2.equals(m1));
		
		// TODO what happens in this case?
		Employee e = m2;
	}

}
