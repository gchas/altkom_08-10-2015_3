package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {

	public static void main(String[] args) {

		Car car1 = new Car("Volvo");
		Car car2 = new Car("Fiat");
		
		List<Car> cars = new ArrayList<Car>();
		
		cars.add(car1);
		cars.add(car2);
		
		Collections.sort(cars, new BrandComparator());
		
		for (Car car : cars) {
			System.out.println("marka: " + car.getMarka());
		}

	}

}
