package javaIOStreams.serialization;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyWriteUsingDataOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo= new FileOutputStream(System.getProperty("user.dir")+"\\src\\javaIOStreams\\serialization\\MyTextDS.txt");
		DataOutputStream ds = new DataOutputStream(fo);
		
		Student s= new Student();
		s.rollNo=10;
		s.name= "John";
		s.dept="ECE";

		ds.writeInt(s.rollNo);
		ds.writeUTF(s.name);
		ds.writeUTF(s.dept);

		fo.close();ds.close();

	}

}
