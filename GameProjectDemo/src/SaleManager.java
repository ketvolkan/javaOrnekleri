
public class SaleManager implements ISaleManager {

	@Override
	public void doSale(Sale sale) {
		System.out.println(sale.getCustomer().getFirstName()+" Adlý Kullanýcýya "+sale.getGame().getGameName()+" Adlý Oyun " + sale.getDate()+" Tarihinde "+ sale.getPrice()+" Fiyatýna Satýldý...");
		
	}
	
}
