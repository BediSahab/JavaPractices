package javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyTwoSource {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\javaIOStreams\\SourceFile.txt");
		FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\javaIOStreams\\DestinationFile.txt");

		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\\\src\\\\javaIOStreams\\FinalDestinationFile.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);// to read two source
		
		int x;
		while((x=sis.read())!=-1)
		{
			fos.write(x);
		}
		
		fis1.close();
		fis2.close();
		fos.close();
		sis.close();
	}

}
