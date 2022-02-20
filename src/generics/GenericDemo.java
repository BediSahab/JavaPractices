package generics;

public class GenericDemo<T> {

	@SuppressWarnings("unchecked")
	T data[] = (T[]) new Object[3];
	public static void main(String[] args) {
		
		GenericDemo<String> gd = new GenericDemo<String>();
		
		gd.data[0] ="hello";
		gd.data[1]="hi";
		//gd.data[2]=10;          //can't add integer, giving error at compile time

	}

}
