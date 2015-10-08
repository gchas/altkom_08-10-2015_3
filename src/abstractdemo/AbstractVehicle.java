package abstractdemo;

public abstract class AbstractVehicle {

	public abstract int getPredkosc();
	
	public abstract String getMarka();
	
	public void showInfo() {
		
		System.out.println("Marka: " + getMarka());
		System.out.println("Predkosc: " + getPredkosc());
		System.out.println("\n");
	}
}
