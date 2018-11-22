package smells.example1;

public class CustomerSummaryView {
	private Customer customer;
	public CustomerSummaryView(Customer customer) {
		this.customer = customer;
	}	
	
	public String getCustomerSummary() {
		return customer.summarise();
	}
}
