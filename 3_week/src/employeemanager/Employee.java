package employeemanager;


public class Employee {
	
	// Employee salary
	private int salary;
	// Employee name
	private String name;
	
	public Employee(int salary, String name) {
		// How can we fix this?
		this.salary = salary;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (!this.getClass().equals(o.getClass())) return false;

		Employee e = (Employee) o;

		if (!this.name.equals(e.name)) return false;
		if (this.salary != e.salary) return false;
		return true;
	}
	
	// What if I want to construct an employee a different way?
	
	// How can I let people use salary and name if they're private?
	public String getName() {
		return this.name;
	}

	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int s) {
		if (s < 0)
			return;
		
		this.salary = s;
	}
}
