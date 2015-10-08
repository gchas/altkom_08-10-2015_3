package pl.altkom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

public class MyWebReader {

	static Logger logger = Logger.getLogger(MyWebReader.class);
	
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://en.wikipedia.org/wiki/List_of_municipalities_in_Georgia_(U.S._state)");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String str ="";
		
		while((str = in.readLine()) != null) {
			
			//System.out.println(str);
			
			logger.debug(str);
		}

		in.close();
	}

}
