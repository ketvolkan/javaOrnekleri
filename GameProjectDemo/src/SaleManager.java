
public class SaleManager implements ISaleManager {

	@Override
	public void doSale(Sale sale) {
		System.out.println(sale.getCustomer().getFirstName()+" Adl� Kullan�c�ya "+sale.getGame().getGameName()+" Adl� Oyun " + sale.getDate()+" Tarihinde "+ sale.getPrice()+" Fiyat�na Sat�ld�...");
		
	}
	
}
