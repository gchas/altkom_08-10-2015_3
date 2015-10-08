package abstractdemo;

public class Plane extends AbstractVehicle {

	@Override
	public int getPredkosc() {
		return 200;
	}

	@Override
	public String getMarka() {
		return "Boeing";
	}

}
