package business.concretes;

import business.abstracts.ICustomerVerificationService;
import entities.concretes.Customer;

public class CustomerVerification implements ICustomerVerificationService{

	@Override
	public void sendMail(Customer customer) {
		System.out.println("Onaylama Epostas� G�nderildi...");
	}

	@Override
	public void verificationOk(Customer customer) {
		customer.setVerification(true);
	}

}
