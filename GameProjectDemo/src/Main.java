
public class Main {

	public static void main(String[] args) {
		Customer volkan = new Customer("1223213132", "Volkan", "Ket", 2002);
		Campaign campaign = new Campaign("Kýþ Ýndirimi", "20/05/2021", "20/06/2021", 20);
		Game game = new Game("Valorant","Riot Games", 160, campaign);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		CustomerManager customerManager = new CustomerManager();
		if (customerManager.verification(volkan)) 
		{
			Sale sale = new Sale(game,volkan,game.getPrice(),"25/05/2021");
			
			SaleManager saleManager = new SaleManager();
			saleManager.doSale(sale);
		}
	}

}
