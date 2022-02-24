package multithreading;

public class MyThread2Test {

	public static void main(String[] args) {
		MyThread1 th = new MyThread1("My Thread 1");
		
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		//th.setPriority(10);
		//System.out.println(th.getPriority());
		System.out.println(th.getState());
		th.start();
		System.out.println(th.getState());
		System.out.println(th.isAlive());
		
		th.interrupt();

	}

}
