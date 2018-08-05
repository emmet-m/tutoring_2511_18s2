package employeemanager;

import java.time.LocalDate;

public class Manager extends Employee {
	
	private LocalDate hireDate;
	
	// 
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	// TODO: USE JAVADOC
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	public Manager(int salary, String name, LocalDate hireDate) {
		
		super(salary, name);
		
		this.hireDate = hireDate;
	}
	
	@Override
	public boolean equals(Object o) {
		return false;
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