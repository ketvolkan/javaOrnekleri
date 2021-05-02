package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void saveToDatabase(Customer customer) {
		System.out.println("Databaseye Kaydedildi -->"+ customer.getFirtsName());
		
	}

}
