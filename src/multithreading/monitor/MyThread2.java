package multithreading.monitor;

public class MyThread2 extends Thread{
	
	MyData d;
	
	MyThread2(MyData d)
	{
		this.d =d;
	}
	public void run()
	{
		d.display("Welcome");
	}
}
