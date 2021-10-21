package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class DatesInJava5 {

	public static void main(String[] args) {

		/*New date API of Java 8 */
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date formated: "+currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
		
		LocalTime currentHour = LocalTime.now();
		System.out.println("Current hour formated: "+DateTimeFormatter.ofPattern("HH:mm:ss").format(currentHour));
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter todayDateTime =  DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm.ss");
		System.out.println("Current date and time formated: "+currentDateTime.format(todayDateTime));
		
	}

}
