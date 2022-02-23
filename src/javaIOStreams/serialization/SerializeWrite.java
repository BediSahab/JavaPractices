package javaIOStreams.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo= new FileOutputStream(System.getProperty("user.dir")+"\\src\\javaIOStreams\\serialization\\MySer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		
		Student2 s= new Student2(10,"John","ECE",88.8f);
		oos.writeObject(s);
		
		fo.close();oos.close();

	}

}
