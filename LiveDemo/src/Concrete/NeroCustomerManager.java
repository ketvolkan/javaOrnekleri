package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager  {

	IPersonCheckService _personCheckService;
	public NeroCustomerManager(IPersonCheckService _personCheckService) {
		super();
		this._personCheckService = _personCheckService;
	}
	@Override
	public void saveToDatabase(Customer customer) {
		if(_personCheckService.mernisCheck(customer)) {
			System.out.println("Databaseye Kaydedildi -->"+ customer.getFirtsName());
		}
	}

}
