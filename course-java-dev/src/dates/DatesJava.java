package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesJava {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		
		System.out.println("Actual date day: "+date.getDate());
		System.out.println("Week day: "+date.getDay());
		System.out.println("Actual hour: "+date.getHours());
		System.out.println("Actual minutes: "+date.getMinutes());
		System.out.println("Actual seconds: "+date.getSeconds());
		System.out.println("Actual time: "+ new Date(21,10,19).getTimezoneOffset());
		System.out.println("Actual year: " +(date.getYear() + 1900));
		System.out.println("Actual year: " +(date.getYear() + 1900));
		
		/*--------------- Simple Date Format ---------------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm.ss ");
		System.out.println("Actual date in data base format: " +simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Actual date in default format and String: " +simpleDateFormat.format(date));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Object Date: "+ simpleDateFormat.parse("02/05/1983"));
		
		simpleDateFormat = new SimpleDateFormat("dd-MM-yyy");
		System.out.println("Date Actual: "+simpleDateFormat.format(new Date()));
		
	}

}
