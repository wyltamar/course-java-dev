package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatesInJava4 {

	public static void main(String[] args) throws ParseException {

		Date initialDate = new SimpleDateFormat("dd/MM/yyy").parse("21/10/2021");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(initialDate);
		
		for(int portion = 0; portion < 6; portion++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Portion number "+(portion + 1)+" expiretion is at "
					+new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
		}
	}

}
