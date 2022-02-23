package javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\javaIOStreams\\SourceFile.txt");
		byte b[] = new byte[fis.available()];
		fis.read(b);
		String str = new String(b);
		
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\\\src\\\\javaIOStreams\\DestinationFile.txt");
		fos.write(str.toLowerCase().getBytes());
		fis.close();
		fos.close();
	}

}
