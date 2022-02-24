package dateAndTime.depricated;

import java.util.Date;

public class DepricatedDateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime()); // time in millisecond
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		
	}

}
