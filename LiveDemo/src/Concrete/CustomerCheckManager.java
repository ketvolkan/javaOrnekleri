package Concrete;

import Abstract.IPersonCheckService;
import Entities.Customer;


public class CustomerCheckManager implements IPersonCheckService{

	@Override
	public boolean mernisCheck(Customer customer) {
		//tr.gov.nvi.tckimlik.utility.TcknUtility.tcknDogrula(long tcKimlikNo, String ad, String soyad, int dogumYili);
		return true;
	}

}
