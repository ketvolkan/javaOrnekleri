package interfaces;

public class FileLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println(message+" ---> File Logland�...");
		
	}

}
