package javaIOStreams;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile(System.getProperty("user.dir")+"/src/javaIOStreams/RAF.txt","rw");
		
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		rf.write('e');
		System.out.println((char)rf.read());
		rf.skipBytes(3);
		System.out.println((char)rf.read());
		rf.seek(3);
		System.out.println((char)rf.read());
		rf.seek(rf.getFilePointer()-2);
		System.out.println((char)rf.read());

		rf.close();
	}

}
