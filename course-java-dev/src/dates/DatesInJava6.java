package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatesInJava6 {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date: "+ currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
		System.out.println("Week day: "+currentDate.getDayOfWeek());
		System.out.println("Current month: "+currentDate.getMonthValue()+" = "+currentDate.getMonth());
		System.out.println("Month day: "+currentDate.getDayOfMonth());
		System.out.println("Year day: "+currentDate.getDayOfYear());
		System.out.println("Current year: "+currentDate.getYear());
		
	}

}
