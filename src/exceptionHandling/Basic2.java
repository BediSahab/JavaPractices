package exceptionHandling;

public class Basic2 {

	public static void main(String[] args) {
		
		fun3();

	}

	public static void fun1()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	public static void fun2()
	{
		fun1();
	}
	public static void fun3()
	{
		fun2();
	}
}
