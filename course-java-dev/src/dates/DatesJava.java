package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DatesJava {

	public static void main(String[] args) throws ParseException {

		/*Creating instance of SimpleDateFormat*/
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
		
		
		Date dueDateTicket = simpleDateFormat.parse("21/10/2021");
		
		Date currentDate = simpleDateFormat.parse("21/10/2021");
		
		
		if(dueDateTicket.before(currentDate)) {
			System.out.println("Ticket expired!");
		}else {
			System.out.println("Ticket is not expired");
		}
		System.out.println("---------------------------");
		System.out.println("Expire date: "+dueDateTicket);
		System.out.println("Verify date: "+currentDate);
		
	}

}
