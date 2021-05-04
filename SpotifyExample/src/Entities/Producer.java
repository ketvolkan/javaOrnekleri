package Entities;

public class Producer extends Users {

	private String companyName;

	public Producer(int id, String email, String companyName) {
		super(id, email);
		this.setCompanyName(companyName);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
