package constructor;

public class RectangleConstructor {

	private int l;
	private int b;
	
	public RectangleConstructor()
	{
		l=1;
		b=1;
		System.out.println(l+" "+b);
	}
	public RectangleConstructor(int l,int b)
	{
		this.l=l;
		this.b=b;
		System.out.println(l+" "+b);
	}
	public int area()
	{
		return l*b;
	}
}
