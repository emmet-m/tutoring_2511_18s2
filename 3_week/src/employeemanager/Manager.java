package employeemanager;

import java.time.LocalDate;

public class Manager extends Employee {
	
	private LocalDate hireDate;
	
	/**
	 * A manager class.
	 * @param salary
	 * @param name
	 * @param hireDate
	 */
	public Manager(int salary, String name, LocalDate hireDate) {
		
		super(salary, name);
		
		this.hireDate = hireDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		
		Manager m = (Manager) o;
		return this.hireDate.equals(m.hireDate);
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