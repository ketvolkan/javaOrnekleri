
public class Game {
	private String gameName;	
	private String company;
	private double price;
	private Campaign campaign;
	
	public Game(String gameName, String company, double price, Campaign campaign) {
		super();
		this.gameName = gameName;
		this.company = company;
		this.price = price;
		this.campaign = campaign;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		double prc;
		if(campaign != null)
		{
		prc = (price*(100-campaign.getDiscount()))/100;
		}
		else {
		prc = this.price;
		}
		return prc;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
}
