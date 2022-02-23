package javaIOStreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {

	public static void main(String[] args) throws IOException {

		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos= new PipedOutputStream();
		
		pos.connect(pis);   //pis.connect(pos);
		PipedConsumer c = new PipedConsumer(pis);
		PipedProducer p = new PipedProducer(pos);
		
		p.start();
		c.start();

	}

}
