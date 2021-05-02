
public class Customer {
	private String nationalityNumber;
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Customer(String nationalityNumber, String firstName, String lastName, int birthYear) {
		super();
		this.nationalityNumber = nationalityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	
	public String getNationalityNumber() {
		return nationalityNumber;
	}
	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}
