package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatesInJava {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();   //Put current date
		
		calendar.setTime(new SimpleDateFormat("dd/MM/yyy").parse("21/10/2021"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 9);
		
		System.out.println("Adding day: "+new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 2);
		System.out.println("Adding Month: "+new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 3);
		System.out.println("Adding Year: "+new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
	}

}
