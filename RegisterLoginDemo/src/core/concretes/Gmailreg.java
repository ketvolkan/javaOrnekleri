package core.concretes;

import GoogleMail.googleMail;
import core.abstracts.IGmailreg;
import entities.concretes.Customer;

public class Gmailreg  implements IGmailreg{

	@Override
	public void addWithGmail(Customer customer) {
		googleMail gmail = new googleMail();
		gmail.Gmailadd(customer);
	}

}
