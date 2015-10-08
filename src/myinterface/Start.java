package myinterface;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MySqlDriver mySqlDriver = new MySqlDriver();
		
		OracleDriver oracleDriver = new OracleDriver();
		
		Serwer serwer = new Serwer();
		
		serwer.setDriver(oracleDriver);
		
		serwer.connectToSystem();
	}
}
