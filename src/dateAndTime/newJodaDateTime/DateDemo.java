package dateAndTime.newJodaDateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class DateDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date d = new Date();
		d.setHours(21);
		System.out.println(d);   //mutable
		
		LocalDate dt = LocalDate.now();
		LocalDate dt1 = LocalDate.now(ZoneId.of("Asia/Calcutta"));
		LocalDate dt2 = LocalDate.of(2022, Month.APRIL, 19);
		System.out.println(dt);
		System.out.println(dt1);
		System.out.println(dt2);

	}

}
