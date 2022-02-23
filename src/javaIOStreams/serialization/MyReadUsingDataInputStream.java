package javaIOStreams.serialization;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyReadUsingDataInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\javaIOStreams\\serialization\\MyTextDS.txt");
		DataInputStream ds = new DataInputStream(fi);
		
		Student s = new Student();
		s.rollNo= ds.readInt();
		s.name= ds.readUTF();
		s.dept=ds.readUTF();
		
		System.out.println(s.rollNo+" "+s.name+" "+s.dept);
		
		fi.close(); ds.close();

	}

}
