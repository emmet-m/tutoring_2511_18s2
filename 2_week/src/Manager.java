import java.time.LocalDate;

public class Manager extends Employee {
	
	private LocalDate hireDate;
	
	// 
	// TODO: USE JAVADOC
	//
	public Manager(int salary, String name, LocalDate hireDate) {
		
		super(salary, name);
		
		this.hireDate = hireDate;
		// We already have salary and name defined in our 
		// Employee class...
		// - Code repetition
		// - Abstraction
		
		// If I don't use ******, What happens?
		
		// How can I use salary and name if I really want to?
	}
	
	@Override
	public void setSalary(int s) {
		if (s < 50000) return;
		
		super.setSalary(s);
		
	}
	
	public void manage() {
		// Nothing for now
	}

}