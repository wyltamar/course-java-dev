package dates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateInJava9 {

	public static void main(String[] args) throws ParseException,InterruptedException {

		/*
		 * LocalDate baseDate = LocalDate.parse("2018-10-03");
		 * 
		 * System.out.println("Plus 5 days: "+ (baseDate = baseDate.plusDays(5)));
		 * 
		 * System.out.println("Plus 5 weeks: " + (baseDate = baseDate.plusWeeks(5)));
		 * 
		 * System.out.println("Plus 5 months: " + (baseDate = baseDate.plusMonths(5)));
		 * 
		 * System.out.println("Plus 2 years: " + (baseDate = baseDate.plusYears(2)));
		 * 
		 * System.out.println("Less 1 year: "+ (baseDate = baseDate.minusYears(1)));
		 * 
		 * System.out.println("Less 3 months: " + (baseDate = baseDate.minusMonths(3)));
		 * 
		 * System.out.println("Less 1 week: " + (baseDate = baseDate.minusWeeks(1)));
		 * 
		 * System.out.println("Less 5 days: " + (baseDate = baseDate.minusDays(5)));
		 * 
		 */		
		/*Installments Generator */
		
		LocalDate purchaseDate = LocalDate.parse("2019-10-05");
		
		for(int installment = 1; installment <= 12; installment++) {
			purchaseDate = purchaseDate.plusMonths(1);
			
			System.out.println("The expiration date is: " +purchaseDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " installment "+ installment);
		}
	}

}
