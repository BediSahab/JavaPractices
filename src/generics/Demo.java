package generics;

public class Demo {

	public static void main(String[] args) {
		
		/* Object Class Limitaion
		Object obj = new String("Hello");
		obj = new Integer(19);
		
		String str = (String) obj; 
		
		it gives ClassCastException
		 */
		Object obj[] = new Object[3];
		obj[0]="hi";
		obj[1]="hello";
		obj[2]=10;
		
		String str;
		for(int i=0;i<3;i++)
		{
			str = (String) obj[i];
			System.out.println(str);
		}
	}

}
