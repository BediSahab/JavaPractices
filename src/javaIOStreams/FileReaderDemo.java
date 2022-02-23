package javaIOStreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir")+"\\src\\javaIOStreams";
		
		try(FileReader fr = new FileReader(path+"\\FileDemo.txt"))
		{
			int x;
			while((x=fr.read())!=-1)
			{
				System.out.print((char)x);
			}
		}
		

	}

}
//same as FileInputStream