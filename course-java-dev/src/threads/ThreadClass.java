package threads;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {

		for(int i = 0; i < 10; i++) {
			System.out.println("Sending email...");
			
			Thread.sleep(1000);
		}
		
		System.out.println("Finishing code exucute");
	}

}
