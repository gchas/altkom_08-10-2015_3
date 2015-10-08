package zipexample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipExtract {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ZipFile zipFile = new ZipFile("file.zip");
		
		Enumeration entries = zipFile.entries();
		
		String rootDir = "C:/Users/Student/git/bookstore/altkom/result";
		
		
				
		while ( entries.hasMoreElements() ) {
	    	ZipEntry entry = (ZipEntry) entries.nextElement();
	    	
	    	System.out.println("entry: " + entry.getName());
	    	
	    	StringTokenizer st = new StringTokenizer(entry.getName(), "/");
	    	
	    	String subPath = "/";
	    	
	    	String fileName = "";
	    	
	    	while (st.hasMoreTokens()) {
	    		
	    		String token = st.nextToken();
	    		if (!token.contains(".")) {
	    			subPath = subPath + token + "/";
	    		} else {
	    			fileName = token;
	    		}
	    	}
	    	
	    	String dirs = rootDir + subPath;
	    	
	    	File dir = new File(dirs);
	    	dir.mkdirs();
	    		    	
	    	System.out.println("dirs: " + dirs);
	    	
	    	String pathToFile = dirs + fileName;
	    	
	    	System.out.println("pathToFile: " + pathToFile);
	    	
	    	copyInputStream(zipFile.getInputStream(entry), 
	    			new FileOutputStream(pathToFile));
	    		    	
	  }
	}
	
	private static void copyInputStream (InputStream in, FileOutputStream out) throws IOException {
		
		int a = 0;
		while ((a = in.read()) != -1) {
			
			out.write(a);
		}
		
		in.close();
		out.close();
	}

}
