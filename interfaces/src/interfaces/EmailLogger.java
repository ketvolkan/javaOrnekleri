package interfaces;

public class EmailLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println(message+" ---> Email Loglandý...");
		
	}

}
