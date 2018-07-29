import java.time.LocalDate;

public class TestEmployeeManager {

	public static void main(String[] args) {
		
		Employee e = new Employee(20000, "Emmet Murray");
		Manager  m = new Manager(40000, "Not Emmet Murray", LocalDate.now()); 

	}

}
