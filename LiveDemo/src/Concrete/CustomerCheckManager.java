package Concrete;

import Abstract.IPersonCheckService;
import Entities.Customer;

public class CustomerCheckManager implements IPersonCheckService{

	@Override
	public boolean mernisCheck(Customer customer) {
		System.out.println("Do�rulama Ba�ar�l�");
		return true;
	}

}
