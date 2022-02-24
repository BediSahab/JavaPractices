package multithreading;

public class MyThread3Test {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 th = new MyThread1("My Thread 2");
		th.setDaemon(true);
		th.start();

		Thread.sleep(1000);  // to wait 1sec or 1000ms 
		
		Thread mainThread = Thread.currentThread(); //getting current thread i.e. MyThread1
		mainThread.join();       // it will wait to complete current thread
	}

}
