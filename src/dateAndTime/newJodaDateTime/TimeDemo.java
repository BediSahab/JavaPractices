package dateAndTime.newJodaDateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class TimeDemo {

	public static void main(String[] args) {
		LocalTime dt = LocalTime.now();
		LocalTime dt1 = LocalTime.now(ZoneId.of("Asia/Calcutta"));
		
		System.out.println(dt);
		System.out.println(dt1);
		
	}

}
