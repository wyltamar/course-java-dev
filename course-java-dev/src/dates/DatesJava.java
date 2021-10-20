package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesJava {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println("Date in miliseconds: "+date.getTime());
		System.out.println("Calendar date in miliseconds: "+calendar.getTimeInMillis() );
		System.out.println("----------------------------------------------------------");
		
		
		System.out.println("Actual date of day: "+date.getDate());
		System.out.println("Calendar actual date of day: "+calendar.get(Calendar.DATE));
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Week day: "+date.getDay());
		System.out.println("Calendar week day: "+(calendar.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Actual hour: "+date.getHours());
		System.out.println("Calendar current hour: "+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Current minutes: "+date.getMinutes());
		System.out.println("Calendar - current minuts: "+calendar.get(Calendar.MINUTE));
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Actual seconds: "+date.getSeconds());
		System.out.println("Calendar - current seconds: "+calendar.get(Calendar.SECOND));
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Actual time: "+ new Date());
		System.out.println("Calendar current time: "+calendar.getTime());
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Actual year: " +(date.getYear() + 1900));
		System.out.println("Calendar current year: "+calendar.get(Calendar.YEAR));
		System.out.println("---------------------------------------------------");
		
		
		/*--------------- Simple Date Format ---------------------------*/
		System.out.println("=========FORMAT DATES====================================");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm.ss ");
		System.out.println("Actual date in data base format: " +simpleDateFormat.format(date));
		System.out.println("Calendar -fomat date data base: "+simpleDateFormat.format(calendar.getInstance().getTime()));
		System.out.println("------------------------------------------------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Actual date in default format and String: " +simpleDateFormat.format(date));
		System.out.println("Calendar format - in format default and string: "+simpleDateFormat.format(calendar.getTime()));
		System.out.println("--------------------------------------------------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("dd-MM-yyy");
		System.out.println("Date Actual: "+simpleDateFormat.format(new Date()));
		System.out.println("Calendar - Date Actual: "+simpleDateFormat.format(calendar.getTime()));
		System.out.println("--------------------------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Object Date: "+ simpleDateFormat.parse("02/05/1983"));
		
	}

}
