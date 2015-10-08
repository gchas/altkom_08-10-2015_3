package abstractdemo;

public class Car extends AbstractVehicle {

	@Override
	public int getPredkosc() {
		return 100;
	}

	@Override
	public String getMarka() {
		return "Fiat";
	}

}
