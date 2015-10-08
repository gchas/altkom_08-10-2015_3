package numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Locale locale = new Locale("pl", "PL");
		
		Locale locale = new Locale("en", "GB");
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		
		double kwota = 123.67;
		
		String wynik = nf.format(kwota);
		
		System.out.println(wynik);
	}

}
