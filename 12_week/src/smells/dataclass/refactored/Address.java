package smells.dataclass.refactored;

public class Address {
	
	private String city;
	private String postCode;
	private String country;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry() {
		return country;
	}
	String getAddressSummary() {
		return getCity() + "," + getPostCode() + "," + getCountry();
	}
	

}
