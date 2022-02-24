package dateAndTime.newJodaDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/YYYY  hh:mm:ss  HH:mm:ss");
		System.out.println(df.format(dt));

	}

}
