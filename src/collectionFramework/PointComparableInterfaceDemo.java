package collectionFramework;

public class PointComparableInterfaceDemo implements Comparable<Object>{

	int x;
	int y;
	public PointComparableInterfaceDemo(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public String toString()
	{
		return "x="+x+" y="+y;
		
	}
	@Override
	public int compareTo(Object o) {
		
		PointComparableInterfaceDemo p = (PointComparableInterfaceDemo)o;
		if(this.x<p.x)
			return -1;
		else if(this.x>p.x)
			return 1;
		else
		{
			if(this.y<p.y)
				return -1;
			else if(this.y>p.y)
				return 1;
			else 
				return 0;
		}
		
	}
}
