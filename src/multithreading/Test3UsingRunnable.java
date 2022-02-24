package multithreading;

public class Test3UsingRunnable implements Runnable{

	public static void main(String[] args) {
		
		Test2 t = new Test2();
		Thread th = new Thread(t);  //object of thread
		th.start();
		
		int i=1;
		while(true)
		{
			System.out.println(i+"World");
			i++;
		}
	}

	@Override
	public void run() {
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
		
	}

}
