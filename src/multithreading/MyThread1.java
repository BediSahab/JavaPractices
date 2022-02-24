package multithreading;

public class MyThread1 extends Thread{

	public MyThread1(String name)
	{
		super(name);
		setPriority(Thread.MAX_PRIORITY);
	}
	@Override
	public void run()
	{
		int count =1;
		while(true)
		{
			System.out.println(count++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
