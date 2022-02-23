package javaIOStreams.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableRead {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\src\\javaIOStreams\\serialization\\MySer.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		Student2 s = (Student2) ois.readObject();
		System.out.println(s);
		
		fi.close(); ois.close();

	}

}
