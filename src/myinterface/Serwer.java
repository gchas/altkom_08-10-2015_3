package myinterface;

public class Serwer {
	
	private Driver driver;

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public void connectToSystem() {
		
		driver.connectToDatabase();
		
		//jakies operacje biznesowe
	}

}
