package dateformat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {

		//Locale locale = new Locale("pl", "PL");
		Locale locale = new Locale("en", "GB");
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		
		//tworzy date dzisiejsza
		Date date = new Date();
		
		String dateAsString = df.format(date);
		
		System.out.println(dateAsString);
	}

}
