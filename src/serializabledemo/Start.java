package serializabledemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Start {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Car car = new Car();
		
		car.setMarka("fiat");
		car.setKolor("red");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("car.ser"));
		out.writeObject(car);
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("car.ser"));
		Car carFromFile = (Car) in.readObject();
		in.close();
		
		System.out.println("Marka: " + carFromFile.getMarka());
		System.out.println("Kolor: " + carFromFile.getKolor());
		
	}

}
