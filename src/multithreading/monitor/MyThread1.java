package multithreading.monitor;

public class MyThread1 extends Thread{

	MyData d;
	
	MyThread1(MyData d)
	{
		this.d =d;
	}
	public void run()
	{
		d.display("Hello World");
	}
}
