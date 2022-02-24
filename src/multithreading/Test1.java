package multithreading;

public class Test1 {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		
		int i=1;
		while(true)
		{
			System.out.println(i+"World");
			i++;
		}

	}

}
