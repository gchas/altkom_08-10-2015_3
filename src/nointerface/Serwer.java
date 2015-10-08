package nointerface;

public class Serwer {

	private MySqlDriver mySqlDriver;

	public void setMySqlDriver(MySqlDriver mySqlDriver) {
		this.mySqlDriver = mySqlDriver;
	}
	
	public void connectToSystem() {
			
		mySqlDriver.connectToDatabase();
		
		//jakies operacje biznesowe
	}
}
