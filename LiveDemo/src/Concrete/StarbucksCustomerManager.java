package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Entities.Customer;
import Entities.StarBucksCustomer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private IPersonCheckService _personCheckService;
	public StarbucksCustomerManager(IPersonCheckService _personCheckService) {
		super();
		this._personCheckService = _personCheckService;
	}
	@Override
	public void saveToDatabase(Customer customer) {
		if(_personCheckService.mernisCheck(customer)) {
			System.out.println("Databaseye Kaydedildi -->"+ customer.getFirtsName());
		}
	}
	public void CoffeBuyForStar(StarBucksCustomer starBucksCustomer) {
		starBucksCustomer.setStarCount(starBucksCustomer.getStarCount()+1);
	}

}
