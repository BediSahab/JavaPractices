package multithreading;

public class Test2 extends Thread{

	@Override
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+"Hello");
			i++;
		}
	}
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		t.start();
		
		int i=1;
		while(true)
		{
			System.out.println(i+"World");
			i++;
		}


	}

}
