package javaIOStreams.serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyRead {

	public static void main(String[] args) throws NumberFormatException, IOException {

		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\javaIOStreams\\serialization\\MyText.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fi));
		
		Student s = new Student();
		s.rollNo= Integer.parseInt(br.readLine());
		s.name= br.readLine();
		s.dept=br.readLine();
		
		System.out.println(s.rollNo+" "+s.name+" "+s.dept);
		
		fi.close(); br.close();

	}

}
