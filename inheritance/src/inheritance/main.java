package inheritance;

public class main {

	public static void main(String[] args) {
		IndividualCustomer volkan = new IndividualCustomer();
		volkan.setCustomerNumber("206001023");
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setCustomerNumber("203001002");
		
		SendikaCustomer abcCustomer = new SendikaCustomer();
		abcCustomer.setCustomerNumber("0000000");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(volkan);
		customerManager.add(abcCustomer);
		
		Customer[] _customers = {volkan,hepsiBurada,abcCustomer};
		customerManager.addMultiple(_customers);
	}

}
