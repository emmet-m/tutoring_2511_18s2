package smells.lazyclasses.refactored;

public class Address {
	
	private final String number;
	private final String street;
	private final String city;
	private final String country;
	private final String postcode;
	
	public Address(String no, String st, String city, String pCode, String country) {
		this.number = no;
		this.street = st;
		this.city = city;
		this.postcode = pCode;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public String getPostcode() {
		return postcode;
	}
	public String getCountry() {
		return country;
	}
	String getAddressSummary() {
		return getCity() + "," + postcode;
	}
	public String getPostcodeArea(){
		return postcode.split("")[0];
	}
	

}
