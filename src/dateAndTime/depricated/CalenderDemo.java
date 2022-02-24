package dateAndTime.depricated;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class CalenderDemo {

	public static void main(String[] args) {
		
		GregorianCalendar  gc = new GregorianCalendar();
		
		System.out.println(gc.isLeapYear(2022));
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.MONTH));
		
		//gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz = gc.getTimeZone();
		System.out.println(tz.getID());

	}

}
