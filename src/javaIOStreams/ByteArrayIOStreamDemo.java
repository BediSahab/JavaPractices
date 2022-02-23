package javaIOStreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayIOStreamDemo {

	public static void main(String[] args) throws IOException {
		
		//input
		byte b[]= {'a','b','c','d'};
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		int x;
		while((x=bis.read())!=-1)
		{
			System.out.println((char)x);

		}
		//String str = new String(bis.readAllBytes());
		bis.close();

		//output
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write('w');
		bos.write('x');
		bos.write('y');
		bos.write('z');
		//byte c[] = bos.toByteArray();
		bos.writeTo(new FileOutputStream(System.getProperty("user.dir")+"\\src\\javaIOStreams\\ByteArrayIODemo.txt"));
		
		bos.close();
	}

}
