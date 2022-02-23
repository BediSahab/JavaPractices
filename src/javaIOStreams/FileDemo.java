package javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\src\\javaIOStreams";
		//System.out.println(path);
		FileOutputStream fos = new FileOutputStream(path+"\\FileDemo.txt");
		
		fos.write("Hello\n".getBytes());
		
		String str = "Learn Java Programming";
		byte b[] = str.getBytes();
		fos.write(b, 6, str.length()-6);
		
		fos.close();
		
		FileInputStream fis = new FileInputStream(path+"\\FileDemo.txt");
		/*byte c[] = new byte[fis.available()];
		fis.read(c);
		
		String str1 = new String(c);
		System.out.println(str1);*/
		int x;
		do
		{
			x=fis.read();
			if(x!=-1)
				System.out.print((char)x);
			
		}while(x!=-1);
		
		
		fis.close();
		
		
		
	}

}
