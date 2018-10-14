package smells.example2;

public class Address {
	
	private final String number;
	private final String street;
	private final String city;
	private final String country;
	private final PostCode postcode;
	
	public Address(String no, String st, String city, 
                   PostCode pCode, String country) {
		this.number = no;
		this.street = st;
		this.city = city;
		this.postcode = pCode;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public PostCode getPostcode() {
		return postcode;
	}
	public String getCountry() {
		return country;
	}
	String getAddressSummary() {
		return getCity() + "," + postcode.getPostcode();
	}
	
}
