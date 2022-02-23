package javaIOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\javaIOStreams\\SourceFile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		/*
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.print((char)x);
		}
		*/
		System.out.println("\nFile: "+fis.markSupported());
		System.out.println("Buffered: "+bis.markSupported());

		
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.mark(10);
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.reset();
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		
		fis.close();
		bis.close();
	}

}
