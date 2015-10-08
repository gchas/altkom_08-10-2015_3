package comparabledemo;

public class Car implements Comparable<Car> {
	
	private String marka;
	
	public Car(String marka) {
		this.marka = marka;
	}
	
	public String getMarka() {
		return marka;
	}

	@Override
	public int compareTo(Car o) {
		return o.marka.compareTo(marka);
	}
}
