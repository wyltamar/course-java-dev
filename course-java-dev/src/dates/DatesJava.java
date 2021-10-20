package dates;

import java.util.Date;

public class DatesJava {

	public static void main(String[] args) {

		Date date = new Date();
		
		System.out.println("Actual date day: "+date.getDate());
		
		System.out.println("Week day: "+date.getDay());
		
		switch (date.getDay()) {
		case 0:
			System.out.println("Sanday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Twosday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
			
		default:
			System.out.println("Saturday");
			break;
		}
		
		System.out.println("Actual hour: "+date.getHours());
		System.out.println("Actual minutes: "+date.getMinutes());
		System.out.println("Actual seconds: "+date.getSeconds());
		System.out.println("Actual time: "+ new Date(21,10,19).getTimezoneOffset());
		System.out.println("Actual year: " +(date.getYear() + 1900));
		System.out.println("Actual year: " +(date.getYear() + 1900));
		
		
	}

}
