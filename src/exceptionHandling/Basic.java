package exceptionHandling;

public class Basic {

	public static void main(String[] args) {

		try
		{
			int a[] = {10,0,8,3,5};
			int r;
			
			r=a[0]/a[1];
			System.out.println(r);
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by 0, try again");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Index");
		}
		finally
		{
			System.out.println("finally block executed with errors too");
		}

	}

}
