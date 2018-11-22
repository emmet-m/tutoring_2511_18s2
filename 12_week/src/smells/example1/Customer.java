package smells.example1;

public class Customer {
	private String firstName;
	private String lastName;
	private String title;
	private Address address;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getTitle() {
		return title;
	}
	public Address getAddress() {
		return address;
	}	
	
	public String summarise() {
		return getFirstName() + getLastName() + 
				getTitle() + address.summarise();
	}
}
