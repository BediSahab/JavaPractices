package javaIOStreams.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MyWrite {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo= new FileOutputStream(System.getProperty("user.dir")+"\\src\\javaIOStreams\\serialization\\MyText.txt");
		PrintStream ps = new PrintStream(fo);
		
		Student s= new Student();
		s.rollNo=10;
		s.name= "John";
		s.dept="ECE";

		ps.println(s.rollNo);
		ps.println(s.name);
		ps.println(s.dept);

		fo.close();ps.close();
	}

}
