package dataAccess.concretes;

import dataAccess.abstracts.ICustomerDao;
import entities.concretes.Customer;

public class CustomerDao implements ICustomerDao {

	@Override
	public void add(Customer customer) {
		if (customer.isVerification()) {
			System.out.println("Database'e Eklendi!");
		}
		else {
			System.out.println("Mail Onaylanmamýþ!");
		}
	}

}
