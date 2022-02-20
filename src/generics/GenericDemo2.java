package generics;

public class GenericDemo2 {

	public static void main(String[] args) {
		
		Data<String> str = new Data<String>();
		str.setObj("hello");
		System.out.println(str.getObj());
	}

}
