package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.getCustomerNumber()+" Kaydedildi...");
	}
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber()+" Kaydedildi...");
		}
	}
}
