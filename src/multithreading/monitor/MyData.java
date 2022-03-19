package multithreading.monitor;

public class MyData {

	void display(String str)
	{
		synchronized(this)
		{
			for(int i=0;i<str.length();i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		
	}
}
