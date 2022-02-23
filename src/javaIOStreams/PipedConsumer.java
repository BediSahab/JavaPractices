package javaIOStreams;

import java.io.InputStream;

public class PipedConsumer extends Thread{

	InputStream is;
	public PipedConsumer(InputStream is)
	{
		this.is=is;
	}
	public void run()
	{
		int x;
		
		while(true)
		{
			try
			{
				x=is.read();
				System.out.println("Consumer: "+x);
				System.out.flush();
			}catch(Exception e) {}
		}
	}
}
