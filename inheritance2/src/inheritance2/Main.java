package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());
		customerManager.add(new DbLogger());
		customerManager.add(new FileLogger());

	}

}
