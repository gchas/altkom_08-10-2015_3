package abstractdemo;

public class Start {

	public static void main(String[] args) {
		
		AbstractVehicle car = new Car();		
		AbstractVehicle plane = new Plane();
		
		car.showInfo();
		
		plane.showInfo();
	}

}
