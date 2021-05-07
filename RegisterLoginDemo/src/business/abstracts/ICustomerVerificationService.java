package business.abstracts;

import entities.concretes.Customer;

public interface ICustomerVerificationService {
	void sendMail(Customer customer);
	void verificationOk(Customer customer);
}
