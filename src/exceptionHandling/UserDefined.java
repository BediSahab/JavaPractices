package exceptionHandling;

public class UserDefined {

	public static void main(String[] args) {
		fun();

	}
	public static void fun()
	{
		try
		{
			throw new UserDefinedExc();
		}
		catch(UserDefinedExc e)
		{
			System.out.println(e);
		}
	}
}
