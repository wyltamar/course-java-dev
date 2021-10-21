package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatesInJava3 {

	public static void main(String[] args)  throws ParseException{

		
	long days = ChronoUnit.DAYS.between(LocalDate.parse("2020-09-21"), LocalDate.now());
	
	System.out.println("Number of days  "+days+ " until current date");
		
	}

}
