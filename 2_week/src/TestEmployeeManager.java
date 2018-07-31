import java.time.LocalDate;

public class TestEmployeeManager {

	public static void main(String[] args) {
		
		Employee e = new Employee(20000, "Emmet Murray");
		Manager  m = new Manager(60000, "Not Emmet Murray", LocalDate.now()); 
		
		System.out.println(e.getName());
		e.setSalary(40000);
		System.out.println(e.getSalary());
		e.setSalary(-10);
		System.out.println(e.getSalary());
		
		m.setSalary(10000);
		m.manage();
		
		Employee m2 = new Manager(60000, "Not Emmet Murray", LocalDate.now()); 

		System.out.println(m2.getSalary());
		m2.setSalary(100);
		System.out.println(m2.getSalary());


	}

}
