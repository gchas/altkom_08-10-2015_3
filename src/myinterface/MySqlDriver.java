package myinterface;

public class MySqlDriver implements Driver {

	@Override
	public void connectToDatabase() {
		
		System.out.println("Lacze z MySQL");
	}

}
