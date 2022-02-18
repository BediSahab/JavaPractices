package methods;

public class VariableParameters {

	public static void main(String[] args) {
		
		show();
		show(10,20);
		show(new int[] {1,2,3,4,4});
		
		

	}
	public static void show(int ...a)
	{
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
