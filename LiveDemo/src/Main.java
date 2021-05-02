import java.sql.Date;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.saveToDatabase(new Customer(0, "Volkan", "Ket",new Date(2002,15,04) , "1283283823"));
	}

}
