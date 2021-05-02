
public class Sale {
	private Game game;
	private Customer customer;
	private double price;
	private String date;
	
	public Sale(Game game, Customer customer, double price, String date) {
		super();
		this.game = game;
		this.customer = customer;
		this.price = price;
		this.date = date;
	}
	
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
