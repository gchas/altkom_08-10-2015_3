package nointerface;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySqlDriver mySqlDriver = new MySqlDriver();
		
		Serwer serwer = new Serwer();
		serwer.setMySqlDriver(mySqlDriver);
		
		serwer.connectToSystem();
		
		
	}

}
