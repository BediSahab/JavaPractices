package javaIOStreams;

import java.io.OutputStream;

public class PipedProducer extends Thread{
	
	OutputStream os;
	public PipedProducer(OutputStream os) {
		this.os = os;
	}
	public void run()
	{
		int count =1;
		while(true)
		{
			try
			{
				os.write(count);
				os.flush();
				
				System.out.println("Producer: "+count);
				System.out.flush();
				Thread.sleep(10);  //for synchronization without threads
				count++;
			}
			catch(Exception e)
			{}
		}
	}
}
