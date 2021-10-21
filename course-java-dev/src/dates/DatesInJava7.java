package dates;

import java.time.Duration;
import java.time.Instant;

public class DatesInJava7 {

	public static void main(String[] args) throws InterruptedException {

		Instant started = Instant.now();
		System.out.println("Started instant: "+started);
		
		Thread.sleep(5000);
		
		Instant iFinal = Instant.now();
		System.out.println("Final instant: "+iFinal);
		
		Duration duration = Duration.between(started, iFinal); 
		 
		System.out.println("Duration in nanoseconds: "+duration.toNanos());
		
		System.out.println("Duration in minutes: "+duration.toMinutes());
		
		System.out.println("Duration in hours: "+duration.toHours());
		
		System.out.println("Duration in milliseconds: "+duration.toMillis());
		
		System.out.println("Duration in days: "+duration.toDays());
		
		System.out.println("Duration in minutes parts: "+duration.toMinutesPart());
		
		
	}

}
