package zipexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipCreate {

	public static void main(String[] args) throws IOException {
		
		String[] fileNames = new String[] {"dir1/build.xml", "dir2/dir3/manifest.mf"};
		
		byte[] buf = new byte[1024];
		
		String fileName = "file.zip";
		
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(fileName)); 
		
		for (int i = 0; i < fileNames.length ; i++) {
			
			FileInputStream in = new FileInputStream(fileNames[i]);
			
			out.putNextEntry(new ZipEntry(fileNames[i]));
			
			int len;
			
			while (  (len = in.read(buf)  ) > 0) {
				
				out.write(buf, 0, len);
			}
			
			out.closeEntry();
			in.close();
		}
		
		out.close();
	}
}
