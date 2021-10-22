package dates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatesInJava8 {

	public static void main(String[] args) throws ParseException, InterruptedException {

		LocalDate datePast = LocalDate.parse("1983-05-02");
		
		LocalDate newDate = LocalDate.parse("2021-10-21");
		
		System.out.println("Does Past date is bigger that new date? "+datePast.isAfter(newDate));
		
		System.out.println("Does Past date is bigger that new date? "+datePast.isBefore(newDate));
		
		System.out.println("Does dates are equals? "+datePast.isEqual(newDate));
		
		Period period = Period.between(datePast, newDate);
		
		System.out.println("Days period: "+period.getDays());
		
		System.out.println("Days months: "+period.getMonths());
		
		System.out.println("Years: "+period.getYears());
		
		System.out.println("Period: "+ period.getYears() +" year(s), "+ period.getMonths() +" month(s) and "
							+ period.getDays() +" days.");
		
		System.out.println("Only months: "+ period.toTotalMonths());
		
	}

}
