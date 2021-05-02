package Concrete;

import Abstract.IPersonCheckService;
import Entities.Customer;

public class CustomerCheckManager implements IPersonCheckService{

	@Override
	public boolean mernisCheck(Customer customer) {
		System.out.println("Doðrulama Baþarýlý");
		return true;
	}

}
