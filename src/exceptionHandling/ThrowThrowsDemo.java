package exceptionHandling;

public class ThrowThrowsDemo {

	static int area(int l, int b) throws Exception   //declaration that this might throw exception
	{
		if(l<0||b<0)
			throw new Exception();  //to throw exception
		return l*b;
	}
	static void meth1() throws Exception
	{
		System.out.println("Area is: "+ area(10,-2));
	}
	
	public static void main(String[] args)
	{
		try {
			meth1();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
