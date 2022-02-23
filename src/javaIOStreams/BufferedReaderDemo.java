package javaIOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fis=new FileReader(System.getProperty("user.dir")+"\\\\src\\\\javaIOStreams\\SourceFile.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        /*
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        */
        System.out.println("String "+bis.readLine());

        fis.close();
        bis.close();
	}

}
