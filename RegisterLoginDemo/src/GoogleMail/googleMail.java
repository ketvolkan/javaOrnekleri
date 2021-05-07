package GoogleMail;

import java.util.List;

import entities.concretes.Customer;

public class googleMail {
	public void Gmailadd(Customer customer) {
			System.out.println(customer.getFirstName()+ " " + customer.getLastName()+" Eklendi...(GmailRegister)");
	}
}
